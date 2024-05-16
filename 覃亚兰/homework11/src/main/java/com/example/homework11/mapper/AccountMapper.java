package com.example.homework11.mapper;

import com.example.homework11.model.Account;
import com.example.homework11.model.Role;

import java.util.List;

public interface AccountMapper {
    // 通过用户名获取账户信息
    Account getAccountByUsername(String username);
    // 通过用户id获取账户角色信息
    List<Role> getAccountRoleById(Integer id);
}