package com.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@SpringBootTest
class MybatisplusdemoApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    void test1(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("川工程大");
        userMapper.insert(user);
    }
    @Test
    void test2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "HE");
        userMapper.delete(wrapper);
        }
    @Test
    void test3(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test4() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test5() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test6() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }

