package mapper;

import bean.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();
   User getUserById(Integer id);
 void addUser(User user);
 void updateUser(User user);
 void deleteUser(Integer id);


}
