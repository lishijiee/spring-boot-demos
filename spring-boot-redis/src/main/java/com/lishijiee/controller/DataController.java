package com.lishijiee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@RestController
public class DataController {

    @Autowired
    public RedisTemplate redisTemplate;

    @RequestMapping("/setString")
    public void setString(HttpServletRequest request){
        redisTemplate.opsForValue().set("ddd", "12345");
    }

    @RequestMapping("/getGet")
    public String getGet(HttpServletRequest request){
        return "hhahah";
    }

    @RequestMapping("hasKey")
    public boolean hasKey(HttpServletRequest request){
        return redisTemplate.hasKey(request.getParameter("key"));
    }
    @RequestMapping("/getValue")
    public Object getValue(HttpServletRequest request){
        return redisTemplate.opsForValue().get(request.getParameter("key"));
    }
    @RequestMapping("/expire")
    public boolean expire(HttpServletRequest request){
        return redisTemplate.expire(request.getParameter("key"), 100, TimeUnit.SECONDS);
    }
    @RequestMapping("/ttl")
    public Long ttl(HttpServletRequest request){
        return redisTemplate.getExpire(request.getParameter("key"));
    }

}
