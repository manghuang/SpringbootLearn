package com.example.springbootlearn2.dao;

import com.example.springbootlearn2.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AccountDao {

    public List<Account> findAll();
}
