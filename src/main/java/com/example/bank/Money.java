package com.example.bank;

import java.math.BigDecimal;

/**
 * Created by afa on 3/1/17.
 */
public class Money {

    private BigDecimal amount;
    private String currency;

    public Money(String currency, BigDecimal amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString() {
        return getCurrency() + getAmount();
    }

    public static Money parse(String input) {
        return new Money(input.substring(0,1), new BigDecimal(input.substring(1, input.length() - 1)));
    }

    public static String toString(Money value) {
        return value.toString();
    }
}
