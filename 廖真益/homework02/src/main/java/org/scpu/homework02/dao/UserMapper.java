package org.scpu.homework02.dao;

import org.apache.ibatis.annotations.*;
import org.scpu.homework02.entity.User;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> selectAll();
    @Select("select * from user where username = #{username}")
    public User selectByUsername(String username);
    @Insert("insert into user(username, password) values(#{username}, #{password})")
    public int insert(User user);
    @Update("update user set password = #{password} where username = #{username}")
    public int update(User user);
    @Delete("delete from user where username = #{username}")
    public int delete(String username);

}
