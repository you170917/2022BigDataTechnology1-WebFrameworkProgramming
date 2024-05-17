package com.example.homework05.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.homework05.model.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

