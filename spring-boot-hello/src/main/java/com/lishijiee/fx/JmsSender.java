package com.lishijiee.fx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JmsSender {
    public static void main(String[] args) {
        Student student = Student.create();
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:springjms-sender.xml");
        SendService sendService = (SendService)context.getBean("sendService");
        sendService.send(student);
        System.out.println("send successfully, please visit http://localhost:8161/admin tosee it");
    }
}
