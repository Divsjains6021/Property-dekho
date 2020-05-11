package com.propertydekho;

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
}
