package com.example.demo.service;

import com.example.demo.bean.Account;
import com.example.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        Account accountByUsername = accountMapper.getAccountByUsername(username);
        if (accountByUsername == null){
            throw new UsernameNotFoundException("用户名不存在!");
        }

        accountByUsername.setRoles(accountMapper.getAccountRoleById(accountByUsername.getId()));
        System.out.println(accountByUsername);
        return accountByUsername;
    }



}
