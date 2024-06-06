package com.example.demo02;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo02.bean.User;
import com.example.demo02.mapper.UserMapper;
import com.example.demo02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo02ApplicationTests {

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
    void insert(){
        User user= new User();
        user.setName("xm");
        user.setWord("jjj");
        user.setAge(22);
        userMapper.insert(user);
    }

    @Test
    void update(){
        User user= new User();
        user.setName("xm");
        user.setWord("jj");
        userMapper.updateById(user);
    }

    @Test
    void delete(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.eq("name","xm");//eq是等于,ne是不等于,gt是大于，lt是小于
        userMapper.delete(wrapper);
    }

    @Test
    void select(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.gt("age","24");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::println);
    }

    @Test
    void selects(){
        List<User> list = userService.list();
        list.forEach(System.out::println);
    }

    @Test
    void insert01(){
        User user = new User();
        user.setName("ab");
        user.setWord("kkk");
        user.setAge(30);
        userService.save(user);
    }

    @Test
    void update01(){
        User user= new User();
        user.setName("ab");
        user.setWord("kkk");
        userService.saveOrUpdate(user);
    }

    @Test
    void delete01(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.eq("name","ab");
        userService.remove(wrapper);
    }

    @Test
    void select01(){
        QueryWrapper<User> wrapper=new QueryWrapper<>();
        wrapper.ne("name","ab");
        userService.list(wrapper);
    }
}
