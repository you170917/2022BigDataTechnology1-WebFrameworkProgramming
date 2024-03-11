package com.example.homework02.demos.web.mapper;

import com.example.homework02.demos.web.User;

import java.util.List;

public interface UserMapper {
    abstract List<User> getAllUsers();
    User getUserById(Integer id);
    void addUser(User users);
    void updateUser(User users);
    void deleteUser(Integer id);
}
