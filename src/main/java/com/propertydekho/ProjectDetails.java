package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectDetails {
    @JsonProperty("proj_name")
    private String projName;
    @JsonProperty("proj_desc")
    private String projDesc;

    public ProjectDetails() {

    }
}

