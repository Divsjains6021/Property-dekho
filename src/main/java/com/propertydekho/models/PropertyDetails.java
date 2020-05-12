package com.propertydekho.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PropertyDetails
{


    @JsonProperty("prop_id")
    private String propID;
    @JsonProperty("prop_name")
    private String propName;
    @JsonProperty("prop_price")
    private double propPrice;
    @JsonProperty("budget_max")
    private double max_budget;
    @JsonProperty("bedroom")
    private int bedroom;
    @JsonProperty("sale_type")
    private String saleType;
    @JsonProperty("constructn_status")
    private String constructionStatus;
    @JsonProperty("area")
    private String area;

    public PropertyDetails() {

    }

    public PropertyDetails(String propID, String propName, double propPrice, double max_budget, int bedroom, String saleType, String constructionStatus, String area) {
        this.propID = propID;
        this.propName = propName;
        this.propPrice = propPrice;
        this.max_budget = max_budget;
        this.bedroom = bedroom;
        this.saleType = saleType;
        this.constructionStatus = constructionStatus;
        this.area = area;
    }
}
