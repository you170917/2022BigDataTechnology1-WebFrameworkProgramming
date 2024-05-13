package com.example.springsecurity.mapper;

import com.example.springsecurity.model.Account;
import com.example.springsecurity.model.Role;

import java.util.List;

public interface AccountMapper {

            Account getAccountByUsername(String username);
            List<Role> getAccountRoleById(Integer id);
}
