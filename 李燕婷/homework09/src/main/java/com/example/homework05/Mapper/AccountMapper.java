package com.example.homework05.Mapper;

import com.example.homework05.model.Account;

import javax.management.relation.Role;
import java.util.List;

public interface AccountMapper {
         Account getAccountByUsername(String username);
         List<Role> getAccountRoleById(Integer id);
}
