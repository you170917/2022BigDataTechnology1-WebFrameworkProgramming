package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.Users;

import java.util.List;

public interface UserMapper {
    List<Users> getAllUsers();

    Users getUserById(Integer id);

    void addUser(Users users);

    void updateUser(Users users);

    void deleteUser(Integer id);
}
