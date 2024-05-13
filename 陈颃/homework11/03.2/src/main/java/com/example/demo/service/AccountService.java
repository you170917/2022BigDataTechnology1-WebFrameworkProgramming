@Service
public class AccountService implements UserDetailsService {
    @Autowired
    AccountMapper accountMapper;
      @param username
      @return
      @throws UsernameNotFoundException
    @Override
    public UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException {
        Account accountByUsername = accountMapper.getAccountByUsername(username);
        if (accountByUsername == null){
            throw new UsernameNotFoundException("用户名不存在!");
        }
        accountByUsername.setRoles(accountMapper.getAccountRoleById(accountByUsername.ge
                tId()));
        return accountByUsername;
    }
}
