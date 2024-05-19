package com.example.mybatisdemo;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<Users> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
    }
}
@Test
void test1(){
    User
}