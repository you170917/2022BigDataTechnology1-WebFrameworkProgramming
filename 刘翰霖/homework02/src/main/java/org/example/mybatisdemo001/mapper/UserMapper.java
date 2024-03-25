package org.example.mybatisdemo001.mapper;
import org.example.mybatisdemo001.pojo.Users;
import java.util.List;

public interface UserMapper {
    //查询全部
    List<Users> getAllUsers();

    //增加
    void addUser(Users users);
    //删除
    void deleteUser(Integer id);
    //查询
    Users getUserById(Integer id);
    //更改
    void updateUser(Users users);

}

