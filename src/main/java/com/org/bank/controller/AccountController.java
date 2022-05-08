package com.org.bank.controller;

import com.org.bank.model.Account;
import com.org.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/create")
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }
    @PutMapping("/update")
    public  void updateAccount(@RequestBody Account account){
        accountService.updateAccount(account);
    }
    @DeleteMapping("/deleteById/{id}")
    public  String deleteById(@PathVariable Integer id){
        String rrr= accountService.deleteById(id);
        return  rrr;

    }
    @GetMapping("/getAll")
    public List<Account> getAll(){
        List<Account> ttt = accountService.getAll();
        return ttt;

    }








}
