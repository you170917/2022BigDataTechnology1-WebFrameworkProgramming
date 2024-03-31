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
        user.setUsername("易烊千玺");
        user.setAddress("怀化市");
        userMapper.insert(user);
        System.out.println(user);
    }
    @Test
    void test2(){
        User user = new User();
        user.setId(1);
        user.setUsername("王俊凯");
        user.setAddress("重庆市");
        userMapper.updateById(user);
        System.out.println(user);
    }
    @Test
    void test3(){
        User user = userMapper.selectById(2);
        System.out.println(user);
    }
    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username","kkk");
        userMapper.delete(wrapper);
        System.out.println("成功删除");
    }
    @Test
    void test5(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", 1);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test6(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test7(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("id", 3);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test8(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lt("id", 4);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test9(){
        List<User> list= userService.list();
        for(User user : list){
            System.out.println(user);
        }
    }
    @Test
    void test10(){
        User user = new User();
        user.setUsername("刘耀文");
        user.setAddress("重庆市");
        userService.save(user);
    }
    @Test
    void test11(){
        User user = new User();
        user.setId(6);
        user.setUsername("宋亚轩");
        user.setAddress("北京市");
        userService.saveOrUpdate(user);
        System.out.println(user);
    }
    @Test
    void test12(){
        User user = userService.getById(6);
        System.out.println(user);
    }
    @Test
    void test13(){
        userService.removeById(6);
        System.out.println("删除成功");
    }
}
