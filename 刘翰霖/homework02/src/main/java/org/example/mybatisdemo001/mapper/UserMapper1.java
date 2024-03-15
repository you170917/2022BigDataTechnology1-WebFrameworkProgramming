package org.example.mybatisdemo001.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.mybatisdemo001.pojo.Users;

import java.util.List;

public interface UserMapper1 {
    @Select("select * from user_table;")
    List<Users> getAllUsers();
    @Select("select * from user_table where user_table.id = #{id};")
    Users getUserById(Integer id);
    @Insert("insert into user_table(username, password) values(#{username}, #{password});")
    void addUser(Users users);
    @Update(("update user_table set user_table.username = #{username} where user_table.id = #{id};"))
    void updateUser(Users users);
    @Delete("delete from user_table where user_table.id = #{id};")
    void deleteUser(Integer id);
}
