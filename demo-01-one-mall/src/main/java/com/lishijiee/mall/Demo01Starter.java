package com.lishijiee.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishijiee.mall.mapper")
public class Demo01Starter {

    public static void main(String[] args) {
        SpringApplication.run(Demo01Starter.class, args);
    }

}
