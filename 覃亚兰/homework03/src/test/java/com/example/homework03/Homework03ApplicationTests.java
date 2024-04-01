package com.example.homework03;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import com.example.homework03.service.impl.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Homework03ApplicationTests {
    @Autowired(required = false)
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
       user.setUsername("hello");
       user.setAddress("川工程大");
       userMapper.insert(user);
  }
    @Test
    void test11(){
        User user = new User();
        user.setId(7);
        user.setAddress("chuanda");
        userMapper.updateById(user);
    }

 @Test
    void test2() {
     QueryWrapper<User> wrapper = new QueryWrapper<>();
     wrapper.eq("username", "HE");
     userMapper.delete(wrapper);
 }
@Test
    void test3() {
    QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
    userQueryWrapper.eq("id", 7);
    List<User> users = userMapper.selectList(userQueryWrapper);
    users.forEach(System.out::println);
}
    @Test
    void test4() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test5() {
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
    @Test
    void test7(){
        User user = userMapper.selectById(2);
        System.out.println(user);
    }
    @Test
    void test8(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username","kkk");
        userMapper.delete(wrapper);
        System.out.println("成功删除");
    }
    @Test
    void  test9(){
        List<User> list = userService.list();
        for (User user : list){
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
    void test12(){
        User user = new User();
        user.setId(7);
        user.setAddress("第五教学楼");
        userService.updateById(user);
    }
    @Test
    void  test13(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username","Spring");
        userService.remove(wrapper);
    }

    }
