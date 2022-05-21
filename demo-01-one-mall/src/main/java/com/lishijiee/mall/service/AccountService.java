package com.lishijiee.mall.service;

import com.lishijiee.mall.bean.Account;

import java.util.List;

public interface AccountService {
    Account getAccountById(Long userId);

    List<Account> getAllAccount();

    void addAccount(Account account);
}
