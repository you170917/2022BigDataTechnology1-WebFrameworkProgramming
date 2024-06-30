package com.example.homework03;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Homework03ApplicationTests {

    @Test
    void contextLoads() {
    }

}

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}

@SpringBootTest
class MybatisPlusApplicationTests {
    @Autowired
    UserMapper userMapper;
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
}

    @Autowired
    UserService userService;

    @Test
    void test8(){
        User user = userService.getById(3);
        System.out.println(user);
    }

    @Test
    void test7(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("Web框架编程");
        userService.save(user);
    }

    @Test
    void test11(){
        userService.removeById(5);
    }

    @Test
    void test12(){
        User user = new User();
        user.setId(1);
        user.setAddress("SpringBoot!");
        userService.updateById(user);
    }