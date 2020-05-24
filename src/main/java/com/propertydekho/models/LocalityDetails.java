package com.propertydekho.models;

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

    public LocalityDetails(String localityRating, String nearby) {
        this.localityRating = localityRating;
        this.nearby = nearby;
    }
}
