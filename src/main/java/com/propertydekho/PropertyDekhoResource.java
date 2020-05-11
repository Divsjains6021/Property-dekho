package com.propertydekho;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/")
public class PropertyDekhoResource
{

    @RequestMapping("/")
    public String getWelcomeMessage(){
        return "Welcome to the world of properties!";
    }

    @RequestMapping("/property-for-sale")
    public List<PropertyDetails> getPropertiesForSale() {
        // 1. Get the area
        // 2. Call the Property Fetcher Service => Get Prop IDs
        // 3. Call the Property Info Service => Get Prop Infos
        // 4. Get the filters. Call the Property Strainer Service => Filtered Prop Infos
        // 5. Get the sorters. Call the Property Comparator Service
        return Collections.singletonList(PropertyDetails.builder().propID("Prop-ID").propName("Prop-name").propPrice(5000000).build());
    }
}
