package com.example.hd.mapper;

import com.example.hd.model.user;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Usermapper {
    @Select("SELECT * FROM users")
    List<user> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    user findById(Integer id);

    @Insert("INSERT INTO users (username, address) VALUES (#{username}, #{address})")
    void insert(user user);

    @Update("UPDATE users SET username = #{username}, address = #{address} WHERE id = #{id}")
    void update(user user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(Integer id);
}
