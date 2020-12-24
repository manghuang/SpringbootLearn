package com.example.demo.serivice.impl;

import com.example.demo.dao.AccountDao;
import com.example.demo.domain.Account;
import com.example.demo.serivice.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service层方法执行...");
        return accountDao.findAll();
    }
}
