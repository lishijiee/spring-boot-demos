package com.lishijiee.boot.service;

import com.lishijiee.boot.bean.Account;

public interface AccountService {
    public Account findByUsername(String username);
}
