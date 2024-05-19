package mapper;

import bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Usermapper1 {
    @Select("select * from user;")
    List<Users> getAllUsers();
    @Select("select * from user where user.id = #{id};")
    Users getUserById(Integer id);
    @Insert("insert into user(username, address) values(#{username}, # {address});")
    void addUser(Users users);

    @Update(("update user set user.username = #{username} where user.id = # {id};"))


    @Delete("delete from user where user.id = #{id};")
    void deleteUser(Integer id);

    default void updateUser() {
        updateUser(null);
    }

    /**
     * @param users
     */
    default void updateUser(Users users) {

    }
}
