package com.example.mydatis.mapper;


import com.example.mydatis.bean.users;
import java.util.List;

public interface userMapper {
    List<users> getAllUsers();
    users getUserById(Integer id);
    void addUser (users users);
    void updateUser (users users);
    void deleteUser (Integer id);
}
