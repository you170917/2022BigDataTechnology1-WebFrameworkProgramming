package com.example.homework05.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.homework05.mapper.Usermapper;
import com.example.homework05.model.User;
import com.example.homework05.service.Userservice;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl  extends ServiceImpl<Usermapper, User> implements Userservice {
}
