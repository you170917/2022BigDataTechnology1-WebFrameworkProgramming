package com.example.homework03.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework03.bean.User;
import com.example.homework03.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    //
}
