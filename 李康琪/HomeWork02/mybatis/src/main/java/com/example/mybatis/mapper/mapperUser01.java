package com.example.mybatis.mapper;

import com.example.mybatis.bean.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface mapperUser01 {
@Select("select *from user")
    List<Users> getAllUsers();
@Select("select * from user where id = #{id};")
    Users getUserById(int i);
@Insert("insert into user(username, address) values (#{username}, #{address});")
    void addUser(Users users);
@Delete("delete from user where user.id = #{id};")
    void deleteUser(int i);
@Update("update user set username = #{username} where user.id = #{id};")
    void modifyUser(Users users);

}
