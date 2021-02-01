package com.drbaz.SpringBootJavaMongo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// MongoDB specified in application.properties
@Document(collection = "Banks2")// collection  = MongoDB collection name
public class Bank {
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Integer getId() {
        return id;
    }
// id  has to unique
    @Id
    private Integer id;
    private String accountNumber;
    private String accountHolder;



}
