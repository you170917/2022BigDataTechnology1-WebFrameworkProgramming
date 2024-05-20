package com.example.homework05.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework05.Mapper.UserMapper;
import com.example.homework05.model.User;
import com.example.homework05.service.UserService;

public class UserServiceImplextends extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }
}
