package com.example.hpldemo01.mapper;

import com.example.hpldemo01.bean.Users;

import java.util.List;

public interface UserMapper {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);
}
