package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BuilderDetails {
    @JsonProperty("builder_id") private String builderId;
    @JsonProperty("builder_name") private String builderName;
    @JsonProperty("builder_locatn") private String builderLocatn;
}
