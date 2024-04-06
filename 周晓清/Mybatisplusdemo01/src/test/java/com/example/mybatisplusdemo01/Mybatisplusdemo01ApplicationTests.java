package com.example.mybatisplusdemo01;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.mybatisplusdemo01.dean.User;
import com.example.mybatisplusdemo01.mapper.UserMapper;
import com.example.mybatisplusdemo01.service.UserService;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplusdemo01ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void test8(){
        User user = userService.getById(3);
        System.out.println(user);
    }
    @Test
    void test7(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("Web框架编程");
        userService.save(user);
    }
    @Test
    void test11(){
        userService.removeById(5);
    }
    @Test
    void test12(){
        User user = new User();
        user.setId(1);
        user.setAddress("SpringBoot!");
        userService.updateById(user);
    }


}