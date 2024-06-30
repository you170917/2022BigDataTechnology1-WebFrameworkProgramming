package com.example.homework10_.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework10_.mapper.UserMapper;
import com.example.homework10_.model.User;
import com.example.homework10_.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
