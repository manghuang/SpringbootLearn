package com.example.springbootlearn2.serivice;

import com.example.springbootlearn2.domain.Account;

import java.util.List;


public interface AccountService {
    public List<Account> findAll();
}
