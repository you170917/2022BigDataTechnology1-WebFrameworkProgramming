package com.example.restful.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.restful.mapper.UserMapper;
import com.example.restful.model.User;
import com.example.restful.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
