package com.example.homework05.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework05.mapper.UserMapper;
import com.example.homework05.model.User;
import com.example.homework05.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
}
