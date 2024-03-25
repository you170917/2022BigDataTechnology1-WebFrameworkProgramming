package com.example.homework02.mapper;

import com.example.homework02.bean.Users;
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
    @Insert("insert into user(user, address) values(#{user}, #{address});")
    void addUser(Users users);
    @Update(("update user set user.user = #{user} where user.id = #{id};"))
    void updateUser(Users users);
    @Delete("delete from user where user.id = #{id};")
    void deleteUser(Integer id);

}
