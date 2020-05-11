package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class ProjectDetails {
        @JsonProperty("prop_id") private String propID;
        @JsonProperty("prop_name") private String propName;
        @JsonProperty("prop_price") private double propPrice;
    }

