package com.example.springboot.mapper;

import java.util.List;

public interface Usermapper1 {
    @Select("select * from user;")
    List<Users> getAllUsers();
    @Select("select * from user where user.id = #{id};")
    Users getUserById(Integer id);
    @Insert("insert into user(username, address) values(#{username}, #
            {address});")
    void addUser(Users users);
}
Update(("update user set user.username = #{username} where user.id = #
        {id};"))
        void updateUser(Users users);
@Delete("delete from user where user.id = #{id};")
 void deleteUser(Integer id);
}
