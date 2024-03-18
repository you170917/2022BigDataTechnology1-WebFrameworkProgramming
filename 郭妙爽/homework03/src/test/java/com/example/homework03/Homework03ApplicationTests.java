package com.example.homework03;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import com.example.homework03.service.UserService;
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
        List<User> users=userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    //mapper层的 CRUD 接口进行增删改查
    @Test
    void test1(){
        User user = new User();
        user.setUsername("hi");
        user.setAddress("川工大");
        userMapper.insert(user);
    }

    @Test
    void test2(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username","HE");
        userMapper.delete(wrapper);
    }

    @Test
    void test12(){
        User user = userMapper.selectById(2);
        System.out.println(user);
    }

    @Test
    void test13(){
        User user = new User();
        user.setId(3);
        user.setUsername("hi");
        user.setAddress("川工大");
        userMapper.updateById(user);

    }

    //条件构造器
    @Test void test3(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }

    @Test void test4(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }

    @Test void test5(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }

    @Test void test6(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }

    //service 层的 CRUD 接口进行增删改查

    //查找所有数据库中的数据
    @Test
    void test7(){
        List<User> list = userService.list();
        for (User user:list){
            System.out.println(user);
        }
    }

    //插入数据
    @Test
    void test8(){
        User user = new User();
        user.setUsername("JK");
        user.setAddress("JUNGKOOK");
        userService.save(user);
    }

    @Test void test9(){
        User user = userService.getById(3);
        System.out.println(user);
    }

    @Test void test10(){
        userService.removeById(5);
    }

    @Test void test11(){
        User user = new User();
        user.setId(1);
        user.setAddress("SpringBoot!");
        userService.updateById(user);
    }

}
