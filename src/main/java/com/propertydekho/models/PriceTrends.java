package com.propertydekho.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PriceTrends {
    @JsonProperty("price_history")
    private String priceHistory;
    @JsonProperty("avg_price")
    private long avgPricePerSqFt;

    public PriceTrends() {

    }

    public PriceTrends(String priceHistory, long avgPricePerSqFt) {
        this.priceHistory = priceHistory;
        this.avgPricePerSqFt = avgPricePerSqFt;
    }
}

