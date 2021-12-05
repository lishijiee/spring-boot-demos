package com.lishijiee.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendMail {
    @Autowired
    private JavaMailSender mailSender;

//    private String from;

    @Value("${spring.mail.username}")
    public void sendSimpleMail(String from, String to, String subject, String text){
        SimpleMailMessage sm = new SimpleMailMessage();
        // 发件人，收件人，邮件主题，邮件内容
        sm.setFrom(from);
        sm.setTo(to);
        sm.setSubject(subject);
        sm.setText(text);
        mailSender.send(sm);

    }
}
