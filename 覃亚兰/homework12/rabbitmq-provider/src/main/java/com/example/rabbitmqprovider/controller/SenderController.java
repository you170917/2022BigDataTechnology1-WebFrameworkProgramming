package com.example.rabbitmqprovider.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SenderController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        String context = "hello " + new Date();
        System.out.println("Sender 生产者发送消息 : " + context);
        rabbitTemplate.convertAndSend("exchange", "TestDirectRouting",context);
        return "消息发送成功!";
    }
}
