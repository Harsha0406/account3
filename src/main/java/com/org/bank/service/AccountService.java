package com.org.bank.service;

import com.org.bank.model.Account;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    public void createAccount( Account account);
    public  void updateAccount(Account account);
    public  String deleteById( Integer id);
    public List<Account> getAll();






    }
