package com.example.homework02;

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
    @Test
    void test1(){
        Users user = userMapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    void test2(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("SiChuan");
        userMapper.addUser(users);
    }
    @Test
    void test3(){
        Users users = new Users();
        users.setId(1);
        users.setUsername("youlinwei");
        userMapper.updateUser(users);
    }
    @Test
    void test4(){
        userMapper.deleteUser(4);
    }
}

}
