package homework09.server.mapper;

import homework09.server.model.Account;
import homework09.server.model.Role;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {
    @Select("SELECT * FROM account WHERE username = #{username}")
    Account getAccountByUsername(String username);

    @Select("SELECT * FROM role WHERE account_id = #{id}")
    List<Role> getAccountRoleById(Integer id);
}