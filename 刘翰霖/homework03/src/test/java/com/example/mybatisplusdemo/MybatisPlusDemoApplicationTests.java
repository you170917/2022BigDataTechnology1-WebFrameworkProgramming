package com.example.mybatisplusdemo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatisplusdemo.mapper.Usermapper;
import com.example.mybatisplusdemo.pojo.Users;
import com.example.mybatisplusdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {
    @Autowired
    Usermapper usermapper;
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        List<Users> users = usermapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void test1(){
        Users user = new Users();
        user.setUsername("hello");
        user.setPassword("123456");
        usermapper.insert(user);
    }
    @Test
    void test2() {
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "hello");
        usermapper.delete(wrapper);
    }
    @Test
    void test3(){
        QueryWrapper<Users> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", 1);
        List<Users> users = usermapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test4(){
        QueryWrapper<Users> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 1);
        List<Users> users = usermapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test5(){
        QueryWrapper<Users> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("id", 1);
        List<Users> users = usermapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test6() {
        QueryWrapper<Users> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lt("id", 3);
        List<Users> users = usermapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test7() {
        List<Users> list = userService.list();
        for (Users users:list){
            System.out.println(users);
        }
    }
    @Test
    void test8() {
        Users user = new Users();
        user.setUsername("hello");
        user.setPassword("123456");
        userService.save(user);
    }
}
