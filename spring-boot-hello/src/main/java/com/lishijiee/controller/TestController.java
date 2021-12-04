package com.lishijiee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/getSth.json")
    public String getSth(){
        return "SUCCESS";
    }
}
