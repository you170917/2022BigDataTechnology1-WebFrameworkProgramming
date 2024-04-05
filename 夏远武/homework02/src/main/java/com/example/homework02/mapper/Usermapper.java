package com.example.homework02.mapper;

import java.util.List;
import com.example.homework02.bean.em2;

public interface Usermapper {
    List<em2> getAllUsers();
    em2 getUserById(Integer id);
    void addUser(em2 users);
    void updateUser(em2 users);
    void deleteUser(Integer id);

}
