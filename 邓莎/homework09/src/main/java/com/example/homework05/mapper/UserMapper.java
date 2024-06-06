package com.example.homework05.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.homework05.model.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper extends BaseMapper<User> {
}
