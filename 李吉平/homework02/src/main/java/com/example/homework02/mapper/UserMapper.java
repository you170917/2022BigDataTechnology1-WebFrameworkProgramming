package com.example.homework02.mapper;

import com.example.homework02.bean.Users;

import java.util.List;

public interface UserMapper {
    List<Users> getAllUsers();

    static Users getUserById(Integer id) {
        return null;
    }

    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);
}
