package com.drbaz.SpringBootJavaMongo.Controller;

import com.drbaz.SpringBootJavaMongo.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Array;
import java.util.Arrays;
// use this controller for web pages
// the service layer stays the same in both controllers
@Controller
public class BankThymeLeafController {
    @Autowired
    private BankService bankService;
    @GetMapping
    String getBanks(Model model){

        model.addAttribute("something","this is comming from the controller");
        model.addAttribute("banks", bankService.getBanks());
        return "allbanks";
    }
}
