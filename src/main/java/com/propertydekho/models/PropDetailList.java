package com.propertydekho.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PropDetailList
{


    private List<PropertyDetails> propertyDetails;

    public PropDetailList() {
    }

    public PropDetailList(List<PropertyDetails> propertyDetails) {
        this.propertyDetails = propertyDetails;
    }
}
