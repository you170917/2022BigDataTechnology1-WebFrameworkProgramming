package com.example.homework03;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import com.example.homework03.service.UserService;
import com.example.homework03.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Homework03ApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList((QueryWrapper<Object>) null);
        users.forEach(System.out::println);
//        for (User user : users) {
//            System.out.println(user);
//        }
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
    @Test
    void test6(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("id",2);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test7(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("id",2);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test8(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lt("id",2);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test9(){
        List<User> list = userService.list();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    void test10(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("第五教学楼");
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
        user.setAddress("springBoot!");
        userService.updateById(user);
    }
}