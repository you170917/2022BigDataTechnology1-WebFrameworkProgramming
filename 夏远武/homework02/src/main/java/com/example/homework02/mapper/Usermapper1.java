package com.example.homework02.mapper;

import java.util.List;
import com.example.homework02.bean.em2;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Usermapper1 {
    @Select("select * from user;")
    List<em2> getAllUsers();
    @Select("select * from user where user.id = #{id};")
    em2 getUserById(Integer id);

    @Insert("insert into user(username, age,kc_id) values(#{username}, # {age},#{kc_id});")
    void addUser(em2 users);

    @Update(("update user set user.username = #{username} where user.id = # {id};"))
     void updateUser(em2 users);
    @Delete("delete from user where user.id = #{id};")
    void deleteUser(Integer id);



}
