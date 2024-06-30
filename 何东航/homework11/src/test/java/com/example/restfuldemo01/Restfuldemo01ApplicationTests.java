package com.example.restfuldemo01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootTest
class Restfuldemo01ApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new
                BCryptPasswordEncoder();
        for (int i = 0; i < 1; i++) {
            System.out.println(bCryptPasswordEncoder.encode("24876021"));
        }
    }
    @Test
    public void abc(){
        SimpleMailMessage message = new SimpleMailMessage(); //构建邮件对象
        message.setSubject("账户登录提醒"); //设置邮件主题
        message.setFrom("2048097948@qq.com"); //设置邮件发送者
        message.setTo("adpim9rc7k@163.com"); //设置邮件接收者,可以有多个接收者
        Date date = new Date();
        message.setSentDate(date); //设置邮件发送日期
        message.setText("您的账号已于 " + date.toString() + " 进行登录!"); //设置

        javaMailSender.send(message); //发送邮件

    }


}
