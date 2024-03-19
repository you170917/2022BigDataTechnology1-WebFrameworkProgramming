package com.example.homework03.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.homework03.bean.User;

public interface UserMapper extends BaseMapper<User> {
    @Override
    int insert(User entity);
}
