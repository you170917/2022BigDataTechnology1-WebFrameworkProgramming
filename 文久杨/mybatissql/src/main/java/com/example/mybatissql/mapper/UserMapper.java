package com.example.mybatissql.mapper;

import com.example.mybatissql.bean.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllusers();

    User getUserById(Integer id);
    void addUser(User users);
    void updateUser(User users);
    void deleteUser(Integer id);
}
