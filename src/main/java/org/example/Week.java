package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"number", "expense"})
public class Week {
    private int NUMBER;
    private Expense[] EXPENSE;

    public int getNUMBER() {
        return NUMBER;
    }

    @JsonProperty("NUMBER")
    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }

    public Expense[] getEXPENSE() {
        return EXPENSE;
    }

    @JsonProperty("EXPENSE")
    public void setEXPENSE(Expense[] EXPENSE) {
        this.EXPENSE = EXPENSE;
    }
}
