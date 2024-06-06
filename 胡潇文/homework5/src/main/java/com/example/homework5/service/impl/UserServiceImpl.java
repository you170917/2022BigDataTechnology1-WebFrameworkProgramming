package com.example.homework5.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework5.mapper.UserMapper;
import com.example.homework5.model.User;
import com.example.homework5.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements
        UserService {
}
