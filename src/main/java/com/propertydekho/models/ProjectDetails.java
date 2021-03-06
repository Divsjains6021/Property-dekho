package com.propertydekho.models;

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

    public ProjectDetails(String projName, String projDesc) {
        this.projName = projName;
        this.projDesc = projDesc;
    }
}

