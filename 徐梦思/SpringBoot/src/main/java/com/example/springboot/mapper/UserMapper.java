package com.example.springboot.mapper;


public interface UserMapper {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);

}