package com.example.restfuldemo01.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.restfuldemo01.mapper.UserMapper;
import com.example.restfuldemo01.model.User;
import com.example.restfuldemo01.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
