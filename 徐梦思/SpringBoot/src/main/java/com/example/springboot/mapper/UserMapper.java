package com.example.springboot.mapper;


public interface UserMapper {
    List<Users> getAllUsers();
}

@MapperScan(basePackages = "com.example.mybatis.mapper")
@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}