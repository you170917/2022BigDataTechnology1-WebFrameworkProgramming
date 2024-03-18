package com.example.mapper;

import com.example.bean.Users;

import java.util.List;

public interface userMapper {
    List<Users> getAllUsers();
    Users getUsername(String name);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(String name);

}
