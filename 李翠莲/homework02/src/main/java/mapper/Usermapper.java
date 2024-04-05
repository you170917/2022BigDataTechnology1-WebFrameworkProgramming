package mapper;

import bean.Users;

import java.util.List;

public interface Usermapper {
    List<Users> getAllUsers();
    Users getUserById(Integer id);
    void addUser(Users users);
    void updateUser(Users users);
    void deleteUser(Integer id);

    void DeleteUser(int i);
}
