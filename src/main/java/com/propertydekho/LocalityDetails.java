package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LocalityDetails {
    @JsonProperty("locality_rating")
    private String localityRating;
    @JsonProperty("nearby")
    private String nearby;

    public LocalityDetails() {

    }
}
