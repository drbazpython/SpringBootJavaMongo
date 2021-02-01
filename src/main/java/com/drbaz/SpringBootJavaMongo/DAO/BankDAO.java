package com.drbaz.SpringBootJavaMongo.DAO;

import com.drbaz.SpringBootJavaMongo.Model.Bank;
import com.drbaz.SpringBootJavaMongo.Model.BankUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

// DAO = Digital Access Object
// Here we instantiate the BankRepository interface
// to make its methods available to our service via a set of functions
// The functions are separated from the data source
// THIS IS THE CLASS WHICH INTERACTS WITH THE DATA SOURCE
@Component
public class BankDAO {
    @Autowired
    private BankRepository repository;
    public Collection<Bank> getBanks(){
        return repository.findAll();
    }

    public Bank createBank(Bank bank) {
        return repository.insert(bank);
    }

    public Optional<Bank> getBankById(int id) {
        return repository.findById(id);
    }

    public Optional<Bank> deleteBankById(int id) {
        Optional <Bank> bank = repository.findById(id);
        bank.ifPresent(b -> repository.delete(b));
        return bank;
    }

    public Optional<Bank> updateBankById(int id, BankUpdatePayload bankUpdatePayload) {
        Optional <Bank> bank = repository.findById(id);
        bank.ifPresent(b -> b.setAccountNumber(bankUpdatePayload.getAccountNumber()));
        bank.ifPresent(b -> b.setAccountHolder(bankUpdatePayload.getAccountHolder()));
        bank.ifPresent(b -> repository.save(b));
        return bank;

    }
}
