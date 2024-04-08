package com.example.homework01.mapper;

import com.example.homework01.bean.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();

    User getUserById(Integer id);

    void addUser(User users);

    void updateUser(User users);

    void deleteUser(Integer id);
}
