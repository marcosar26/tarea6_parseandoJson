package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"who", "week"})
public class Persona {
    private String WHO;
    private Week[] WEEK;

    public String getWHO() {
        return WHO;
    }

    @JsonProperty("WHO")
    public void setWHO(String WHO) {
        this.WHO = WHO;
    }

    public Week[] getWEEK() {
        return WEEK;
    }

    @JsonProperty("WEEK")
    public void setWEEK(Week[] WEEK) {
        this.WEEK = WEEK;
    }
}
