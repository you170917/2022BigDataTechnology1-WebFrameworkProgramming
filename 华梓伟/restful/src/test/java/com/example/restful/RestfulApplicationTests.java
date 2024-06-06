package com.example.restful;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RestfulApplicationTests {
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
    @Test
    public void test3(){
        stringRedisTemplate.opsForValue().set("address", "5D501");
        String address = stringRedisTemplate.opsForValue().get("address");
        System.out.println(address);
    }


}
