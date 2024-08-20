package com.example.demo2.service;

import com.example.demo2.mapper.AccountMapper;
import com.example.demo2.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AccountService implements UserDetailsService {
    @Autowired
    AccountMapper accountMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account accountByUsername = accountMapper.getAccountByUsername(username);
        if (accountByUsername == null) {
            throw new UsernameNotFoundException("用户名不存在！");
        }
        accountByUsername.setRoles(accountMapper.getAccountRolesById(accountByUsername.getId()));
        return accountByUsername;
    }

}
