package com.example.homework11_back.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework11_back.mapper.UserMapper;
import com.example.homework11_back.model.User;
import com.example.homework11_back.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
