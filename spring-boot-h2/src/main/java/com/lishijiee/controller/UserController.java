package com.lishijiee.controller;

import com.lishijiee.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public Object test(){
        return userMapper.getUserById(1L);
    }
}
