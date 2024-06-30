package com.example.homework10_2;

import com.example.homework10_2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AccountService accountService;
    /**
      * 在内存中配置两个账密:admin/123456,user/123456
      * @param auth
      * @throws Exception
      */
 @Override
 protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
 auth.inMemoryAuthentication()
.withUser("admin").roles("admin").password("$2a$10$tNPKIrvFJcHPRj7qKr4KhumV7BCADl zZ1YmDiAwxmDAW2IasTnoYe").and()
            .withUser("user").roles("user").password("$2a$10$UUuALsFWwpFfyRymWqz0bujqOvAbcBOS VVvUgPXKrvLLfr/Iv6isW");
    }
 @Bean
 PasswordEncoder passwordEncoder(){
 return new BCryptPasswordEncoder();
  }
 @Override
 protected void configure(HttpSecurity http) throws Exception{
     http.authorizeRequests()
             .antMatchers("/admin/*").hasRole("admin")
             .antMatchers("/user/*").hasRole("user")
             .anyRequest().authenticated()
             .and()
             .formLogin()
             .permitAll();
 }
}
