package com.example.demo.service;

import com.example.demo.bean.Account;
import com.example.demo.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AccountService implements UserDetailsService {
    @Autowired
    AccountMapper accountMapper;
    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//                  1. 先根据用户名拿到账户信息;
            Account accountByUsername = accountMapper.getAccountByUsername(username);
            if (accountByUsername == null){
                throw new UsernameNotFoundException("用户名不存在!");
            }else {
//                  2. 再根据账户信息拿到该账户对应的角色信息
                accountByUsername.setRoles(accountMapper.getAccountRoleById(accountByUsername.getId()));
                return accountByUsername;
            }
        }
    }

