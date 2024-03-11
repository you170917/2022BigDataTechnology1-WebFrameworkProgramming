package com.example.demo.mapper;

import com.example.demo.bean.Users;
import java.util.List;
public interface UserMapper {
    List <Users> getAllUsers();
        Users getUserById(Integer id);
        void addUser(Users users);
        void updateUser(Users users);
        void deleteUser(Integer id);
    }
