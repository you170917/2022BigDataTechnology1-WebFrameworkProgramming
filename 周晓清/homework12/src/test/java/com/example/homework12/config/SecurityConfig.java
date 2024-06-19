package com.example.homework11.config;


import com.example.homework11.model.Account;
import com.example.homework11.service.AccountService;
import com.example.homework11.util.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    AccountService accountService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(accountService);
.successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest
                                                                httpServletRequest, HttpServletResponse httpServletResponse, Authentication
                                                                authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        Account account = (Account) authentication.getPrincipal();
                        account.setPassword(null);
                        Result ok = Result.success("登录成功！", account);
                        String string = new ObjectMapper().writeValueAsString(ok);

                        writer.write(string);
                        writer.flush();
                        writer.close();
                        SimpleMailMessage message = new SimpleMailMessage(); //构建邮件对象
                        message.setSubject("账户登录提醒"); //设置邮件主题
                        message.setFrom("1476219151@qq.com"); //设置邮件发送者
                        message.setTo("you170917@gmail.com"); //设置邮件接收者,可以有多个接收者
                        Date date = new Date();
                        message.setSentDate(date); //设置邮件发送日期
                        message.setText("您的账号已于 " + date.toString() + " 进行登录!"); //设置 邮件的正文

                        javaMailSender.send(message); //发送邮件

                        try {
                            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
                            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                            helper.setSubject("账户登录提醒");
                            helper.setFrom("1476219151@qq.com");
                            helper.setTo("you170917@gmail.com");
                            Date date = new Date();
                            helper.setSentDate(date);
                            helper.setText("您的账号已于 " + date.toString() + " 进行登录!");
                            helper.addAttachment("1.jpg", new
                                    File("C:\\Users\\linwei\\Desktop\\1.jpg"));
                            javaMailSender.send(mimeMessage);
                        } catch (MessagingException e) {
                            log.error("发送邮件失败: " + e.toString());
                        }


                    }
                }
        )
    }