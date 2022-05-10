package com.lishijiee.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishijiee.boot.mapper")
public class Demo01ShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo01ShiroApplication.class, args);
    }

}
