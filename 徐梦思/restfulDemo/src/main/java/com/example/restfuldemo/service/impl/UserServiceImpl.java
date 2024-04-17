package com.example.restfuldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.restfuldemo.mapper.UserMapper;
import com.example.restfuldemo.service.UserService;
import com.example.restfuldemo.model.User;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {


}
