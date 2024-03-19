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
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void test1(){
        User user = new User();
        user.setName("王");
        user.setAge(12);
        user.setGender("男");
        userMapper.insert(user);
    }

    @Test
    void test2(){
        User user = new User();
        user.setId(6);
        user.setName("春天");
        userMapper.updateById(user);
        System.out.println(user);
    }

    @Test
    void test3(){
        User user =userMapper.selectById(4);
        System.out.println(user);
    }

    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name","王");
        userMapper.delete(wrapper);
    }

    @Test
    void test5(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",6);
        List<User> users = userMapper.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void test6(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ne("id",6);
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
        queryWrapper.lt("id",4);
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

    @Test
    void test9(){
        List<User> list = userService.list();
        for (User user : list ){
            System.out.println(user);
        }
    }

    @Test
    void test10(){
        User user = new User();
        user.setName("hi");
        user.setAge(99);
        user.setGender("男");
        userService.save(user);
    }

    @Test
    void test11(){
        userService.removeById(5);
    }

    @Test
    void test12(){
        User user = new User();
        user.setId(3);
        user.setName("萧小五");
        user.setAge(21);
        user.setGender("女");
        userService.updateById(user);
    }
}
