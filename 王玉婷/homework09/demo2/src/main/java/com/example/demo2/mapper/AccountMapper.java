package com.example.demo2.mapper;

import com.example.demo2.model.Account;
import com.example.demo2.model.Role;

import java.util.List;

public interface AccountMapper {
    Account getAccountByUsername(String username);
    List<Role> getAccountRolesById(Integer id);
}
