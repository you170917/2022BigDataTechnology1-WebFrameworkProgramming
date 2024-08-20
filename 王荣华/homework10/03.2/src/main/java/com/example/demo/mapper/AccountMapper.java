package com.example.demo.mapper;
import com.example.demo.bean.Account;
import com.example.demo.bean.Role;
import org.mapstruct.Mapper;

import java.util.List;
@Mapper
public interface AccountMapper {
        // 通过用户名获取账户信息
        Account getAccountByUsername(String username);
        // 通过用户id获取账户角色信息
        List<Role> getAccountRoleById(Integer id);
}

