package com.example.demo2.mapper;

import com.example.demo2.bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper1 {
    @Select("select * from user;")
    List<Users> getAllUsers();
    @Select("select * from user where user.id = #{id};")
    Users getUserById(Integer id);
    @Insert("insert into user(name,age,gender) values(#{name},#{age},#{gender});")
    void addUser(Users user);
    @Update(("update user set user.name = #{name} where user.id = #{id};"))
    void updateUser(Users user);
    @Delete("delete from user where user.id = #{id};")
    void deleteUser(Integer id);
}
