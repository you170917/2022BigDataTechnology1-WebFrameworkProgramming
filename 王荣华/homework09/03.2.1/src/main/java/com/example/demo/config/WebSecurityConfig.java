package com.example.demo.config;

import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//Security在内存中配置
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("damn")
//                .password("10086")
//                .roles();
        //security5.0之前就可以正常启动，5.0以后会报错

        //原因：需要指定加密方式
//        方式一：通过AuthenticationManagerBuilder指定
//        auth.inMemoryAuthentication()
//                .passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("damn")
//                .password("10086")
//                .roles();


//    }

    //        方式二：通过@Bean注入指定PasswordEncoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    //使用数据库配置账户密码改造后代码：
    @Autowired
    AccountService accountService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.userDetailsService(accountService);
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
//                .antMatchers("/admin/*").hasRole("admin")
//                .antMatchers("/user/*").hasRole("user")
                .antMatchers("/damn/*").hasRole("admin")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll();

// 这个用法用于处理登录表单，通过 http.authorizeRequests().antMatchers("路径").hasRole("角色") ，赋予相应角色的路径访问权限：
//1. 角色 admin 可以访问 /admin/* 路径；
//2. 角色 user 可以访问 /user/* 路径；
//.anyRequest().authenticated() 表示所有请求都需要登录过后才能访问。

    }
}
