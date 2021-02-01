package com.drbaz.SpringBootJavaMongo.Service;

import com.drbaz.SpringBootJavaMongo.DAO.BankDAO;
import com.drbaz.SpringBootJavaMongo.Model.Bank;
import com.drbaz.SpringBootJavaMongo.Model.BankUpdatePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

// this service provides the functionality to the controller
@Service
public class BankService {
    @Autowired
    private BankDAO bankDAO;
    public Collection<Bank> getBanks(){
        return bankDAO.getBanks();
    }

    public Bank createBank(Bank bank) {
        return bankDAO.createBank(bank);
    }

    public Optional<Bank> getBankById(int id) {
        return bankDAO.getBankById(id);
    }

    public Optional<Bank> deleteBankById(int id) {
        return bankDAO.deleteBankById(id);
    }

    public Optional<Bank> updateBankById(int id, BankUpdatePayload bankUpdatePayload) {
        return bankDAO.updateBankById(id,bankUpdatePayload);
    }
}
