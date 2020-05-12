package com.propertydekho.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BuilderDetails {
    @JsonProperty("builder_id")
    private String builderId;
    @JsonProperty("builder_name")
    private String builderName;
    @JsonProperty("builder_locatn")
    private String builderLocatn;

    public BuilderDetails() {

    }
    public BuilderDetails(String builderId, String builderName, String builderLocatn) {
        this.builderId = builderId;
        this.builderName = builderName;
        this.builderLocatn = builderLocatn;
    }
}
