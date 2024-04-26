package com.example.mybatisdemo.mapper;

import com.example.mybatisdemo.bean.Users;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


public interface UserMapper {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);
}

