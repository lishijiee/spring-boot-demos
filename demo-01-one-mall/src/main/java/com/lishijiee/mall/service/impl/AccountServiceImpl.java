package com.lishijiee.mall.service.impl;

import com.lishijiee.mall.bean.Account;
import com.lishijiee.mall.mapper.AccountMapper;
import com.lishijiee.mall.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public Account getAccountById(Long userId) {
        return accountMapper.selectById(userId);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountMapper.selectBatchIds(Arrays.asList(1L,2L,3L));
    }

    @Override
    public void addAccount(Account account) {
         accountMapper.updateById(account);
    }
}
