public interface AccountMapper {
    Account getAccountByUsername(String username);
    List<Role> getAccountRoleById(Integer id);
}
