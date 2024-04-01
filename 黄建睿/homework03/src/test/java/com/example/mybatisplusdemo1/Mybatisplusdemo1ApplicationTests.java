package com.example.mybatisplusdemo1;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo1.bean.User;
import com.example.mybatisplusdemo1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplusdemo1ApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    void text1(){
    User user = new User();
    user.setId(8);
    user.setUsername("ikun");
    user.setAddress("shudadd");
    userMapper.insert(user);
    }
    @Test
    void text2(){
        User user = new User();
        user.setId(3);
        user.setAddress("6666");
        userMapper.updateById(user);
    }
    @Test
    void  text3(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "John Doe");
        userMapper.delete(wrapper);
    }
    @Test
    void  text4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.ne("username", "John Doe");
        userMapper.delete(wrapper);
    }
    @Test
    void  text5() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("username", "John Doe");
        userMapper.delete(wrapper);
    }
    @Test
    void  text6() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lt("username", "John Doe");
        userMapper.delete(wrapper);
    }

    @Test
    void text7(){
        User user = new User();
        user.setId(9);
        user.setUsername("ikunkun");
        user.setAddress("dddd");
        userMapper.save(user);
    }
    @Test
    void text8(){
        User user = new User();
        user.setId(9);
        user.setUsername("ikunkun");
        user.setAddress("dddd");
        userMapper.update(user);
    }




}

