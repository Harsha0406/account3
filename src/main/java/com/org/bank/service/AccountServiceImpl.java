package com.org.bank.service;

import com.org.bank.model.Account;
import com.org.bank.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
@Autowired
    AccountRepo accountRepo;
    @Override
    public void createAccount(Account account) {

        accountRepo.save(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepo.save(account);
    }

    @Override
    public String deleteById(Integer id) {
        accountRepo.deleteById(id);
        return "success";
    }

    @Override
    public List<Account> getAll() {
        List<Account> sss = accountRepo.findAll();
        return sss;
    }







}



