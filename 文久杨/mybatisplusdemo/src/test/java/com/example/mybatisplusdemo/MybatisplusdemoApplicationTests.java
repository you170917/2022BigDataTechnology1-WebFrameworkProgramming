package com.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
        user.setId(9);
        user.setUsername("二狗");
        user.setAddress("高新区");
        userMapper.insert(user);
    }
    @Test
    void test2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id",2);
        userMapper.delete(wrapper);
    }
    @Test
    void test3(){
        User user = new User();
        user.setId(7);
        user.setUsername("文久杨");
        userMapper.update(user);
    }
    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("address","5d401");
        userMapper.delete(wrapper);
    }
    @Test
    void test5(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",2);
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }
}