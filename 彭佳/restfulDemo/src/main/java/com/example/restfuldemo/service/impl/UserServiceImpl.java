package com.example.restfuldemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.restfuldemo.mapper.UserMapper;
import com.example.restfuldemo.model.User;
import com.example.restfuldemo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public boolean saveOrUpdate(User entity) {
        return false;
    }

//    @Override
//    public Object (Wrapper<User> queryWrapper, Function<? super Object, > mapper) {
//        return null;
 //   }
}
