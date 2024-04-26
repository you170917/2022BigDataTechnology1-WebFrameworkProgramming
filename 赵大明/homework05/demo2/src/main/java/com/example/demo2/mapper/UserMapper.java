package com.example.demo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo2.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserList();
}
