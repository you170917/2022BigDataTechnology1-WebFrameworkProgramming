package com.example.homework03.mapper;

@MapperScan(basePackages = "com.example.mybatisplus.mapper")
@SpringBootApplication
public class MybatisPlusApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }
}
