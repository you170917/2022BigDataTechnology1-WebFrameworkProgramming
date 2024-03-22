package com.example.mybatis.mapper;

import com.example.mybatis.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Usermapper {

    List<User> getAllUser();
    User getUserById(Integer id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Integer id);

}
