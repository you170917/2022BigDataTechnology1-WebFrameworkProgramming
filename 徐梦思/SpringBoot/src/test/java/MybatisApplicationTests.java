import com.example.springboot.bean.User;
import com.example.springboot.mapper.UserMapper;
import com.example.springboot.mapper.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper1;

    @Test
    void test5(){
        List<Users> allUsers = userMapper1.getAllUsers();
        System.out.println(allUsers);
    }
    @Test
    void test6(){
        Users user = userMapper1.getUserById(5);
        System.out.println(user);
    }
    @Test
    void test7(){
        Users users = new Users();
        users.setUsername("hello");
        users.setAddress("Spring!");
        userMapper1.addUser(users);
    }
    @Test
    void test8(){
        Users users = new Users();
        users.setId(6);
        users.setUsername("Spring");
        userMapper1.updateUser(users);
    }
    @Test
    void test9(){
        userMapper1.deleteUser(2);
    }
}



