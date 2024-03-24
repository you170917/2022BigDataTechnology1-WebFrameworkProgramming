package com.example.mybatis.mapper;

import com.example.mybatis.bean.Users;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface mapperUser {

    List<Users> getAllUsers();
    Users getUserById(int i);
    void addUser(Users users);
    void deleteUser(int i);
    void modifyUser(Users users);

}
