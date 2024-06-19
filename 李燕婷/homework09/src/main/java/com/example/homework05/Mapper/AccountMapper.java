package com.example.homework05.Mapper;

import com.example.homework05.model.Account;
import org.mapstruct.Mapper;

import javax.management.relation.Role;
import java.util.List;
@Mapper
public interface AccountMapper {
    Account getAccountByUsername(String username);

    List<Role> getAccountRoleById(Integer id);
}
