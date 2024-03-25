package com.example.homework02.mapper;

import com.example.homework02.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * from user")
    List<User> getAllUsers();
}
