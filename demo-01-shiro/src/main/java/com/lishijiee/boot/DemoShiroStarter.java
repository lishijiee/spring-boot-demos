package com.lishijiee.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishijiee.boot.mapper")
public class DemoShiroStarter {

    public static void main(String[] args) {
        SpringApplication.run(DemoShiroStarter.class, args);
    }

}
