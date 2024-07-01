package com.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo.bean.User;
import com.example.mybatisplusdemo.mapper.UserMapper;
import com.example.mybatisplusdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisplusdemoApplicationTests {
    @Autowired
    UserMapper usermapper;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        List<User> users = usermapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void text1() {
        User user = new User();
        user.setId(8);
        user.setUsername("hell");
        user.setAddress("6-718");
        usermapper.insert(user);
    }

    @Test
    void text2() {
        User user = new User();
        user.setId(6);
        user.setAddress("6-301");
        usermapper.updateById(user);
    }

    @Test
    void text3() {
        User user = usermapper.selectById(4);
        System.out.println(user);
    }

    @Test
    void text4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("address", "6-718");
        usermapper.delete(wrapper);
    }

    @Test
    void text5() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", "7");
        List<User> users = usermapper.selectList(wrapper);
        System.out.println(users);
    }

    @Test
    void text6() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.ne("id", "2");
        List<User> users = usermapper.selectList(wrapper);
        users.forEach(System.out::println);

    }
    @Test
    void text7() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.gt("id", "2");
        List<User> users = usermapper.selectList(wrapper);
        users.forEach(System.out::println);

    }
    @Test
    void text8() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lt("id", "2");
        List<User> users = usermapper.selectList(wrapper);
        users.forEach(System.out::println);

    }
    @Test
    void text9(){
        User user = new User();
        user.setId(9);
        user.setUsername("wy");
        user.setAddress("666");
        userService.save(user);
    }
    @Test
    void text10() {
        User user = new User();
        user.setId(9);
        user.setAddress("777");
        userService.updateById(user);
    }
    @Test
    void text11(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", "9");
        userService.remove(wrapper);
    }
    @Test
    void text12(){
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }
    @Test
    void text13(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lt("id", "5");
        userService.list(wrapper);
        List<User> users = usermapper.selectList(wrapper);
        users.forEach(System.out::println);
    }
}