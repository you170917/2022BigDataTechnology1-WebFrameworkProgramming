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
    @Autowired(required = false)
    UserMapper userMapper;
    @Autowired
    UserService userService;
    @Test
    void test1() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    void test2(){
    QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
    userQueryWrapper.eq("id", 2);
    List<User> users = userMapper.selectList(userQueryWrapper);
    users.forEach(System.out::println);
    }
    @Test
    void test3(){
    User users = new User();
    users.setUsername("小雨");
    users.setAddress("重庆");
    userMapper.insert(users);
    System.out.printf(String.valueOf(users));
    }
    @Test
    void test4(){
    QueryWrapper<User> wrapper = new QueryWrapper<>();
    wrapper.eq("username", "小芳");
    userMapper.delete(wrapper);
    System.out.printf("删除成功！");
    }
    @Test
    void test5(){
        User users = new User();
        users.setId(6);
        users.setUsername("小湖");
        userMapper.updateById(users);
        System.out.printf(String.valueOf(users));
    }
    @Test
    void test6() {
        List<User> list = userService.list();
        for (User user : list) {
            System.out.printf(String.valueOf(user));
        }
    }
    @Test
    void test7(){
        User user = userService.getById(3);
        System.out.println(user);
        }
    @Test
    void test8(){
        User users = new User();
        users.setUsername("小兰");
        users.setAddress("北京");
        userService.save(users);
        System.out.printf(String.valueOf(users));
    }
    @Test
    void test9(){
    User users = new User();
    users.setId(1);
    users.setUsername("小阳");
    userService.updateById(users);
    System.out.printf(String.valueOf(users));
    }
    @Test
    void test10(){
        userService.removeById(5);
        System.out.printf("删除成功！");
    }
}
