package com.example.rabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("您收到一条消息  : " + hello);
    }
}