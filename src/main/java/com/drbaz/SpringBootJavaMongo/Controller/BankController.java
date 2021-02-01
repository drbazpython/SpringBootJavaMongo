package com.drbaz.SpringBootJavaMongo.Controller;

import com.drbaz.SpringBootJavaMongo.Model.Bank;
import com.drbaz.SpringBootJavaMongo.Model.BankUpdatePayload;
import com.drbaz.SpringBootJavaMongo.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;
//use this controller for API Interface
// the service layer stays the same in both controllers
@RestController
@RequestMapping("/banks")
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping
    public Collection<Bank> getBanks(){
        return bankService.getBanks();
    }

    @PostMapping
    public Bank postBank(@RequestBody Bank bank){
        return bankService.createBank(bank);

    }

    @GetMapping(value="/{id}")
    public Optional<Bank> getBankById(@PathVariable("id") int id){
        return bankService.getBankById(id);
    }

    @DeleteMapping(value="/{id}")
    public Optional<Bank> deleteBankById(@PathVariable("id") int id){
        return bankService.deleteBankById(id);
    }

    @PutMapping(value="/{id}")
    public Optional<Bank> updateBankById(@PathVariable("id") int id,
                                         @RequestBody BankUpdatePayload bankUpdatePayload){
        return bankService.updateBankById(id, bankUpdatePayload);
    }
}
