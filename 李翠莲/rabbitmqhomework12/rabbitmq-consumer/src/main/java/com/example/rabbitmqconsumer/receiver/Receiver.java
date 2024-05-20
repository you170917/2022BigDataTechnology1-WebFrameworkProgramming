package com.example.rabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver 消费者收到消息 : " + hello);
    }
}
