package homework09.server.service;

import homework09.server.mapper.AccountMapper;
import homework09.server.model.Account;
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
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account accountByUsername = accountMapper.getAccountByUsername(username);
        if (accountByUsername == null){
            throw new UsernameNotFoundException("用户名不存在!");
        }else {
            accountByUsername.setRoles(accountMapper.getAccountRoleById(accountByUsername.getId()));
            return accountByUsername;
        }
    }
}

