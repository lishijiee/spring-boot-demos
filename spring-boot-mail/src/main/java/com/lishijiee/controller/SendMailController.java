package com.lishijiee.controller;

import com.lishijiee.util.SendMail;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringRunner.class)
public class SendMailController {
    @Autowired
    SendMail sendMail;

    @RequestMapping("/sendSimpleMail")
    public void sendSimpleMail(){
        sendMail.sendSimpleMail("","","这是我程序发送的第一封邮件", "hello, Simple text");
    }
}
