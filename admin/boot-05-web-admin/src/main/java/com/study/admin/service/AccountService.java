package com.study.admin.service;

import com.study.admin.bean.Account;
import com.study.admin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RenAshbell
 * @create 2022-05-31-15:12
 */
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAcctById(Long id){
        return accountMapper.getAcct(id);
    }
}
