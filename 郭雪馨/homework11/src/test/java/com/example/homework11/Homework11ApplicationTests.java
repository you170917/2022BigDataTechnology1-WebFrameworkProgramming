package com.example.homework11;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootTest
class Homework11ApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        for (int i = 0; i < 2; i++) { System.out.println(bCryptPasswordEncoder.encode("123456")); }
    }
    @Test
    public void test1(){
        SimpleMailMessage message = new SimpleMailMessage();//构建邮件对象
        message.setSubject("这是一封测试邮件");//设置邮件主题
        message.setFrom("1476219151@qq.com");//设置邮件发送者
        message.setTo("2452903674@qq.com");//设置邮件接收者，可以有多个接收者
//        message.setCc("you170917@gmail.com");//设置邮件抄送人，可以有多个抄送人
//        message.setBcc("14×xxxx098@qq.com");//设置隐秘抄送人，可以有多个
        message.setSentDate(new Date());//设置邮件发送日期
        message.setText("这是测试邮件的正文");//设置邮件的正文
      //  JavaMailSender.send(message);//发送邮件
    }
    @Test
    public void test2(){
        redisTemplate.opsForValue().set("name", "2022大数据技术1");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
    @Test
    public void test3(){
        stringRedisTemplate.opsForValue().set("address", "5D501");
        String address = stringRedisTemplate.opsForValue().get("address");
        System.out.println(address);
    }


}
