package com.drbaz.SpringBootJavaMongo.Model;

public class BankUpdatePayload {

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    private String accountNumber;
    private String accountHolder;
}
