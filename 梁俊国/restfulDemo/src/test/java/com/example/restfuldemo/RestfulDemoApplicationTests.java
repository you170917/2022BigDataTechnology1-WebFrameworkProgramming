package com.example.restfuldemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RestfulDemoApplicationTests {
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void contextLoads() {
    }
    @Test
    public void test2(){
        redisTemplate.opsForValue().set("name", "2022大数据技术1");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
