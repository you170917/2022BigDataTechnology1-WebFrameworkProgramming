package org.example.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.mybatisplusdemo.bean.User;
import org.example.mybatisplusdemo.mapper.UserMapper;
import org.example.mybatisplusdemo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {



}
