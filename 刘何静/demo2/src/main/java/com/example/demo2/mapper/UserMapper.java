package com.example.demo2.mapper;

import com.example.demo2.bean.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<Users> getAllUsers();

    Users getUserById(Integer id);

    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);
}
