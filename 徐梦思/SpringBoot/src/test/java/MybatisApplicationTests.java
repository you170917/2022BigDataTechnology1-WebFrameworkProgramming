import com.example.springboot.bean.User;
import com.example.springboot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;

@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> allUsers = userMapper.getAllUsers();
        System.out.println(allUsers);
}
}
