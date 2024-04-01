package com.example.mydatis.mapper;

import com.example.mydatis.bean.users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userMapper1 {
    public interface UserMapper1 {
        @Select("select * from user;")
        List<users> getAllUsers();

        @Select("select * from user where user.id = #{id};")
        users getUserById(Integer id);

        @Insert("insert into user(username, address) values(#{username}, # {address});")
        void addUser(users users);

        @Update(("update user set user.username = #{username} where user.id = # {id};"))
        void updateUser(users users);

        @Delete("delete from user where user.id = #{id};")
        void deleteUser(Integer id);
    }
}
