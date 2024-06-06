package com.example.homework09;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootTest
class Homework09ApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;
    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//        for (int i = 0; i < 2; i++) {
            System.out.println(bCryptPasswordEncoder.encode("Test@123."));
//        }
    }
    public void test1(){
        SimpleMailMessage message = new SimpleMailMessage(); //构建邮件对象
        message.setSubject("这是一封测试邮件"); //设置邮件主题
        message.setFrom("2547898936@qq.com"); //设置邮件发送者
        message.setTo("1716719116@qq.com"); //设置邮件接收者,可以有多个接收者
        message.setCc("1716719116@qq.com"); //设置邮件抄送人,可以有多个抄送人
//        message.setCc("12xxxxxxxx123@gmail.com");//设置隐秘抄送人，可以有多个
        message.setSentDate(new Date()); //设置邮件发送日期
        message.setText("这是测试邮件的正文"); //设置邮件的正文
        javaMailSender.send(message); //发送邮件
    }
}
