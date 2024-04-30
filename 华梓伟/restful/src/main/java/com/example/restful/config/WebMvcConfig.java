package com.example.restful.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public abstract class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("")
                .allowedOrigins("http://localhost:8081")
                .allowedMethods("*")
                .exposedHeaders("*");
    }

    protected abstract void configure(AuthenticationManagerBuilder auth) throws Exception;

    protected abstract void configure(HttpSecurity http) throws Exception;
}
