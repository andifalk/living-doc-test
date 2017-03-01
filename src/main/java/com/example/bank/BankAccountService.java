package com.example.bank;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by afa on 2/28/17.
 */
public class BankAccountService {

    private static final Map<String,Money> ACCOUNTS = new HashMap<>();

    public void open(String accountNumber, Money balance) {
        ACCOUNTS.put(accountNumber, balance);
    }

    public void withdraw(String accountNumber, Money amount) {
        BigDecimal newBalance = ACCOUNTS.get(accountNumber).getAmount().subtract(amount.getAmount());
        ACCOUNTS.put(accountNumber, new Money(amount.getCurrency(), newBalance));
    }

    public void deposit(String accountNumber, Money amount) {
        BigDecimal newBalance = ACCOUNTS.get(accountNumber).getAmount().add(amount.getAmount());
        ACCOUNTS.put(accountNumber, new Money(amount.getCurrency(), newBalance));
    }

    public Money balance(String accountNumber) {
        return ACCOUNTS.get(accountNumber);
    }

}
