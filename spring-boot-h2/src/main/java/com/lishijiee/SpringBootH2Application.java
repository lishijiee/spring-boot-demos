package com.lishijiee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishijiee.mapper")
public class SpringBootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2Application.class, args);
    }

}
