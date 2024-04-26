package com.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import com.example.mybatisplusdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.attribute.UserDefinedFileAttributeView;
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
    void test1() {
        User user = new User();
        user.setUsername("hello");
        user.setAddress("川工程大");
        userMapper.insert(user);
    }

    @Test
    void test2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "HE");
        userMapper.delete(wrapper);
    }

    @Test
    void test3() {
        User user = userMapper.selectById(4);
        System.out.println(user);
    }

    @Test
    void test4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "HE");
        userMapper.delete(wrapper);
    }

    void test5() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", "2");
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void test6() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }
    @Autowired
    UserService userService;

    @Test
    void test7() {
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
