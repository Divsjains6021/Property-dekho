package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocalityDetails {
    @JsonProperty("locality_rating")
    private String localityRating;
    @JsonProperty("nearby")
    private String nearby;

    public LocalityDetails() {

    }
}
