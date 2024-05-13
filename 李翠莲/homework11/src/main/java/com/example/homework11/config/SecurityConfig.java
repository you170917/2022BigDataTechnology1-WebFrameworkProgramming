package com.example.homework11.config;

import com.example.homework11.model.Account;
import com.example.homework11.service.AccountService;
import com.example.homework11.util.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.*;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@Configuration
public class SecurityConfig {
    @Autowired
    AccountService accountService;
    @Autowired
    JavaMailSender javaMailSender;

    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.userDetailsService(accountService);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .loginPage("/login")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest
                                                                httpServletRequest, HttpServletResponse httpServletResponse, Authentication
                                                                authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        Account account = (Account)
                                authentication.getPrincipal();
                        account.setPassword(null);
                        Result ok = Result.success("登录成功！", account);
                        String string = new
                                ObjectMapper().writeValueAsString(ok);
                        writer.write(string);
                        writer.flush();
                        writer.close();

                        SimpleMailMessage message = new SimpleMailMessage(); //构建邮件对
                        message.setSubject("账户登录提醒"); //设置邮件主题
                        message.setFrom("3491685031@qq.com"); //设置邮件发送者
                        message.setTo("3491685031@qq.com"); //设置邮件接收者,可以有多个接收者
                        Date date = new Date();
                        message.setSentDate(date); //设置邮件发送日期
                        message.setText("您的账号已于 " + date.toString() + " 进行登录!"); //设置邮件的正文
                        javaMailSender.send(message); //发送邮件

//                        try {
//                            jakarta.mail.internet.MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//                            MimeMessageHelper helper;
//                            helper = new MimeMessageHelper(mimeMessage,true);
//                            helper.setSubject("账户登录提醒");
//                            helper.setFrom("3491685031@qq.com");
//                            helper.setTo("3491685031@qq.com");
//                            Date date1 = new Date();
//                            helper.setSentDate(date);
//                            helper.setText("您的账号已于 " + date.toString() + " 进行登录!");
//                            helper.addAttachment("1.jpg",new
//                                    File("\"C:\\Users\\1\\Desktop\\图片\\1.jpg.jpg\""));
//                            javaMailSender.send(mimeMessage);
//                        } catch (jakarta.mail.MessagingException e) {
//                            throw new RuntimeException(e);
//                        }
                    }
                })


                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                                        AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        Result result = Result.error("登录失败！");
                        if (httpServletResponse instanceof LockedException){
                            result.setMsg("账户被锁定，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                BadCredentialsException){
                            result.setMsg("用户名或密码输入错误！");
                        }else if (httpServletResponse instanceof
                                DisabledException){
                            result.setMsg("账户被禁用，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                AccountExpiredException){
                            result.setMsg("账户过期，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                CredentialsExpiredException){
                            result.setMsg("密码过期，请联系管理员！");
                        }else {
                            result.setMsg("登录失败！");
                        }
                        String string = new
                                ObjectMapper().writeValueAsString(result);
                        writer.write(string);
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest
                                                        httpServletRequest, HttpServletResponse httpServletResponse, Authentication
                                                        authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        writer.write(new
                                ObjectMapper().writeValueAsString(Result.success("注销登录")));
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
//支持跨域访问，非常重要
                .cors()
                .and()
                .csrf()
                .disable();
    }
}


