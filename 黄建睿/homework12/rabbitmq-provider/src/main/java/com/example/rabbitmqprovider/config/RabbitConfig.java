package com.example.rabbitmqprovider.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue(){
        return new Queue("test");
    }
    @Bean
    DirectExchange exchange() {
        return new DirectExchange("exchange");
    }
    //绑定  将队列和交换机绑定, 并设置用于匹配键：TestDirectRouting
    @Bean
    Binding bindingDirect() {
        return
                BindingBuilder.bind(queue()).to(exchange()).with("TestDirectRouting");
    }
}
