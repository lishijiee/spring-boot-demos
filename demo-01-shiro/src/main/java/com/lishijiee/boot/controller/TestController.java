package com.lishijiee.boot.controller;

import com.lishijiee.boot.bean.Account;
import com.lishijiee.boot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/ok")
    public String testController(){
        return "OK";
    }

    @RequestMapping("/getUser")
    public Account getUser(@RequestParam(value = "userName", required = true, defaultValue = "zs") String userName){
        return accountService.findByUsername(userName);
    }

}
