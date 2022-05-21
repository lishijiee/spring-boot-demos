package com.lishijiee.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.lishijiee.mall.bean.Account;
import com.lishijiee.mall.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/getAccount")
    public Account getAccountById(Long userId){
        Account account = accountService.getAccountById(userId);
        log.info("获取到的用户信息为：{}", JSONObject.toJSONString(account));
        return account;
    }

    @RequestMapping("/index")
    public String getIndex(Model model){
        List<Account> accountList = accountService.getAllAccount();
        log.info("获取到的用户信息为：{}", JSONObject.toJSONString(accountList));
        model.addAttribute("accountList",accountList);
        return "index";
    }

    @RequestMapping("/addAccount")
    public String addAccount(Account account){
        accountService.addAccount(account);
        return "";
    }

}
