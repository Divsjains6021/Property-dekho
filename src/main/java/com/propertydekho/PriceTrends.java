package com.propertydekho;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PriceTrends {
    @JsonProperty("price_history")
    private String priceHistory;
    @JsonProperty("avg_price")
    private long avgPricePerSqFt;

    public PriceTrends() {

    }
}
