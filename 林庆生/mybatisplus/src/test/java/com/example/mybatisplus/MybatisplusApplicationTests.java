package com.example.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplus.bean.User;
import com.example.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {
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
        user.setAddress("5D501");
        userMapper.insert(user);
    }

    @Test
    void test2(){
        User user = new User();
        user.setId(6);
        user.setAddress("5D401");
        userMapper.updateById(user);
    }

    @Test
    void test3(){
        User user = userMapper.selectById(4);
        System.out.println(user);
    }

    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("address","5D401");
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