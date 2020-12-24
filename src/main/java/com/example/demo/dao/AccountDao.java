package com.example.demo.dao;

import com.example.demo.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountDao {

    public List<Account> findAll();
}
