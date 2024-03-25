package mapper;

import bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper1 {
 @Select("select * from user;")
 static List<User> getAllUsers();
 @Select("select * from user where user.id = #{id};")
 static User getUserById(Integer id);
 @Insert("insert into user(username, address) values(#{username}, # {address});")
 static void addUser(User users);
 @Update(("update user set user.username = #{username} where user.id = # {id};"))
 static void updateUser(User users);
 @Delete("delete from user where user.id = #{id};")
 static void deleteUser(Integer id);
}
