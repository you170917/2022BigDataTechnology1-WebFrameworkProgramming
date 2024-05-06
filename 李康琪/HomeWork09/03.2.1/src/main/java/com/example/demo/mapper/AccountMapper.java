package com.example.demo.mapper;

import com.example.demo.bean.Account;
import com.example.demo.bean.Role;

import java.util.List;

public interface AccountMapper {
    Account getAccountByUsername(String username);
    List<Role> getAccountRoleById(Integer id);
}
