package mapper;

import com.example.homework03.bean.User;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.homework03.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MybatisPlusApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    Userservice userservice;
    private User[] list;

    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
//        for (User :users){
//            System.out.println(users);
//        }
    }
    @Test
    void test1(){
        User user = new User();
        user.setUsername("hello");
        user.setAddress("川工程大");
        userMapper.insert(user);
    }
    @Test
    void test2(){
        User user = new User();
        user.setUserId(6);
        user.setAddress("川工大");
        userMapper.updateById(user);
    }
    @Test
    void test3(){
        User user = userMapper.selectById(4);
        System.out.println(user);
    }
    @Test
    void test4(){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username", "HE");
        userMapper.delete(wrapper);
    }
    @Test
    void test5(){
        QueryWrapper<User> querywrapper = new QueryWrapper<>();
        querywrapper.eq("id", 7);
        List<User> users = userMapper.selectList(querywrapper);
        System.out.println(users);

    }
    @Test
    void test6(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.ne("id", 7);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test7(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.gt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test8() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.lt("id", 5);
        List<User> users = userMapper.selectList(userQueryWrapper);
        users.forEach(System.out::println);
    }
    @Test
    void test9(){
        List<User> List = userservice.list();
        
        for(User user : list){
            System.out.println(user);
        }
    }


}
