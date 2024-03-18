package com.example.mybatisdemo.mapper;

import org.apache.catalina.User;

@MapperScan(basePackages = "com.example.mybatis.mapper")
@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}



public interface UserMapper {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);
}

