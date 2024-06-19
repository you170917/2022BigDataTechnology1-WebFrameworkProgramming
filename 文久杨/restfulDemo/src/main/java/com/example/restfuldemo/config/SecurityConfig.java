package com.example.restfuldemo.config;


import com.alibaba.druid.filter.logging.Log4j2Filter;
import com.example.restfuldemo.model.Account;
import com.example.restfuldemo.service.AccountService;
import com.example.restfuldemo.util.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.jpackage.internal.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.PrintWriter;
import java.util.Date;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //    /**
//     * 在内存中配置两个账密:admin/123456,user/123456
//     * @param auth
//     * @throws Exception
//     */
    @Autowired
    AccountService accountService;
    @Autowired
    private Log4j2Filter log;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(accountService);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .loginPage("/login")
                .successHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter writer = httpServletResponse.getWriter();
                    Account account = (Account) authentication.getPrincipal();
                    account.setPassword(null);
                    Result ok = Result.success("登录成功！", account);
                    String string = new ObjectMapper().writeValueAsString(ok);
                    writer.write(string);
                    writer.flush();
                    writer.close();
                    ListOperations<String, String> opsForList = stringRedisTemplate.opsForList();
                    Date date = new Date();
                    opsForList.leftPush("LoginInfo", "您的账号已于 " + date.toString() + " 进行登 录!");
                    try {
                        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
                        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
                        helper.setSubject("账户登录提醒");
                        helper.setFrom("1476219151@qq.com");
                        helper.setTo("you170917@gmail.com");
                        helper.setSentDate(date);
                        helper.setText("您的账号已于 " + date.toString() + " 进行登录!");
                        helper.addInline("p1",new
                                File("C:\\Users\\123\\Videos\\Assassin (2).png"));
                        javaMailSender.send(mimeMessage);
                    } catch (MessagingException e) {
                        Log.error("发送邮件失败: " + e.toString());
                    }
                })
                .failureHandler((httpServletRequest, httpServletResponse, e) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter writer = httpServletResponse.getWriter();
                    Result result = Result.error("登录失败！");
                    if (httpServletResponse instanceof LockedException) {
                        result.setMsg("账户被锁定，请联系管理员！");
                    } else if (httpServletResponse instanceof
                            BadCredentialsException) {
                        result.setMsg("用户名或密码输入错误！");
                    } else if (httpServletResponse instanceof
                            DisabledException) {
                        result.setMsg("账户被禁用，请联系管理员！");
                    } else if (httpServletResponse instanceof
                            AccountExpiredException) {
                        result.setMsg("账户过期，请联系管理员！");
                    } else if (httpServletResponse instanceof
                            CredentialsExpiredException) {
                        result.setMsg("密码过期，请联系管理员！");
                    } else {
                        result.setMsg("登录失败！");
                    }
                    String string = new ObjectMapper().writeValueAsString(result);
                    writer.write(string);
                    writer.flush();
                    writer.close();
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler((httpServletRequest, httpServletResponse, authentication) -> {
                    httpServletResponse.setContentType("application/json;charset=utf-8");
                    PrintWriter writer = httpServletResponse.getWriter();
                    writer.write(new ObjectMapper().writeValueAsString(Result.success("注销登录")));
                    writer.flush();
                    writer.close();
                })
                .permitAll()
                .and()
                .cors()
                .and()
                .csrf()
                .disable();
    }
    @Autowired
    JavaMailSender javaMailSender;

}
