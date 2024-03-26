package com.example.mybatisplusdemo;

import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

 @Autowired
 UserMapper userMapper;
 @Test
 void contextLoads() {
 List<User> users = userMapper.selectList( null);
 System.out.println(users);
 }
}