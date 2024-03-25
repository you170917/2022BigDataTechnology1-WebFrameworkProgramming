package mapper;

import bean.account;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface usermapper {
    List<account> getAllUsers();
}