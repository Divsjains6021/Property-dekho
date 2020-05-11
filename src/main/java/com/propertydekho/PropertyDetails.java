package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PropertyDetails {
    @JsonProperty("prop_id")
    private String propID;
    @JsonProperty("prop_name")
    private String propName;
    @JsonProperty("prop_price")
    private long propPrice;

    public PropertyDetails() {

    }
}

