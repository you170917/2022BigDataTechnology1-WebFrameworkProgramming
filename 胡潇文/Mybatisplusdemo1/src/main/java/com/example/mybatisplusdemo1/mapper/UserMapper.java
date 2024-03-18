package com.example.mybatisplusdemo1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplusdemo1.bean.User;

public interface UserMapper extends BaseMapper {
    void save(User user);

}
