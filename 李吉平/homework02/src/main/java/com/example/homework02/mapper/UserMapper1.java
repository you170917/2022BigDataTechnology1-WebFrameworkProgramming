package com.example.homework02.mapper;

import com.example.homework02.bean.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper1 {
    static void updateUser(Users users) {

    }

    @Select("select * from user;")
    List<Users> getAllUsers();
    @Select("select * from user where user.id = #{id};")
    Users getUserById(Integer id);
    @Insert(value = "insert into user(username, address) values(#{username}, # )
            {address});")

    static void addUser(Users users) {

    }

    @Update(("update user set user.username = #{username} where user.id = #
            {id};"))
            void updateUser(Users users);

    @Delete("delete from user where user.id = #{id};")
    static void deleteUser() {
        deleteUser(null);
    }

    @Delete("delete from user where user.id = #{id};")
    static void deleteUser(Integer id) {

    }
}

