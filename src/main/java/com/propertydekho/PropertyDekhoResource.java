package com.propertydekho;

import com.propertydekho.models.PropDetailList;
import com.propertydekho.models.PropIDs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class PropertyDekhoResource
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String getWelcomeMessage() {
        return "Welcome to the world of properties!";
    }

    @RequestMapping("/property-for-sale")
    public PropDetailList getPropertiesForSale(@RequestParam(name = "area") String area) {

        // 1. Call the Property Fetcher Service => Get Prop IDs
        PropIDs propIDs = restTemplate.getForObject("http://localhost:8085/fetch-propids", PropIDs.class);
        // 2. Call the Property Info Service => Get Prop Infos
        PropDetailList propertyDetails = restTemplate.postForObject("http://localhost:8086/fetch-prop-details", propIDs,PropDetailList.class);
//        PropDetailList propertyDetails = restTemplate.getForObject("localhost:8083/fetch-prop-details", PropDetailList.class);
        // 3. Get the filters. Call the Property Strainer Service => Filtered Prop Infos
        // 4. Get the sorters. Call the Property Comparator Service
        return propertyDetails;
    }
}
