package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@MapperScan(basePackages = "com.example.demo.mapper")
@SpringBootTest
class DemoApplicationTests {

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
    void test4(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test5(){
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

    @Autowired
    UserService userService;
    @Test
    void test7(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("Web框架编程");
        userService.save(user);
    }
    @Test
    void test8(){
        User user = userService.getById(3);
        System.out.println(user);
    }
    @Test
    void test9(){
        userService.removeById(5);
    }
    @Test
    void test10(){
        User user = new User();
        user.setId(1);
        user.setAddress("SpringBoot!");
        userService.updateById(user);
    }
}
