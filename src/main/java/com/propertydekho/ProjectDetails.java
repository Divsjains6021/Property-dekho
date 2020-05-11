package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProjectDetails {
    @JsonProperty("proj_name")
    private String projName;
    @JsonProperty("proj_desc")
    private String projDesc;

    public ProjectDetails() {

    }
}

