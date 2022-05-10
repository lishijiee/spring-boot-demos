package com.lishijiee.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/ok")
    public String testController(){
        return "OK";
    }
}
