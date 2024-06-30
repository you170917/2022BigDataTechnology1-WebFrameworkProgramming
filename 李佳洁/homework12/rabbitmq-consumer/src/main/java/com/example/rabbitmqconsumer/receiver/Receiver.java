package com.example.rabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver 消费者收到消息 : " + hello);
    }
}
