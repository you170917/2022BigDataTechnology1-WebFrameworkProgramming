package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.User;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper extends BaseMapper<User> {
}


