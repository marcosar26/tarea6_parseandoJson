package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"what", "amount"})
public class Expense {
    private String WHAT;
    private double AMOUNT;

    public String getWHAT() {
        return WHAT;
    }

    @JsonProperty("WHAT")
    public void setWHAT(String WHAT) {
        this.WHAT = WHAT;
    }

    public double getAMOUNT() {
        return AMOUNT;
    }

    @JsonProperty("AMOUNT")
    public void setAMOUNT(double AMOUNT) {
        this.AMOUNT = AMOUNT;
    }
}
