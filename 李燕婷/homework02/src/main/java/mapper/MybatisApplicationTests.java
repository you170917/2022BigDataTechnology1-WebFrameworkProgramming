package mapper;

import bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
 UserMapper userMapper;

         @Test
void contextLoads() {
List<User> allUsers = userMapper.getAllUsers();
System.out.println(allUsers);
 }

 void test1(){
 User user = userMapper.getUserById(1);
 System.out.println(user);
 }
@Test
 void test2(){
 User users = new User();
 users.setUsername("hello");
 users.setAddress("SiChuan");
 userMapper.addUser(users);
  }
 @Test
 void test3(){
 User users = new User();
 users.setId(1);
 users.setUsername("youlinwei");
 userMapper.updateUser(users);
 }
 @Test
 void test4(){
 userMapper.deleteUser(4);
  }

  void test5(){
 List<User> allUsers = UserMapper1.getAllUsers();
 System.out.println(allUsers);
  }
 @Test
 void test6(){
 User user = UserMapper1.getUserById(5);
 System.out.println(user);
 }
 @Test
 void test7(){
 User users = new User();
 users.setUsername("hello");
 users.setAddress("Spring!");
 UserMapper1.addUser(users);
  }
 @Test
 void test8(){
 User users = new User();
 users.setId(6);
 users.setUsername("Spring");
 UserMapper1.updateUser(users);
  }
 @Test
 void test9(){
 UserMapper1.deleteUser(2);
  }
}


