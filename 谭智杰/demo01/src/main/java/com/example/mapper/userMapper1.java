package com.example.mapper;

import com.example.bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface userMapper1 {
    @Select("select * from student;")
    List<Users> getAllUsers();

    @Select("select * from student where name = #{name};")
    Users getUsername(String name);

    @Insert("insert into student values (#{name}, #{word},#{age});")
    void addUser(Users users);

    @Update("update student set word = #{word} where naem = #{name};")
    void updateUser(Users users);

    @Delete("delete from studen where name = #{name};")
    void deleteUser(String name);

}
