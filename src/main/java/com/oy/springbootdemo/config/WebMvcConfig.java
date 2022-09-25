package com.oy.springbootdemo.config;

import com.oy.springbootdemo.Interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

public class WebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> pattern = new ArrayList<>();
        pattern.add("/login");
        registry.addInterceptor(loginInterceptor).addPathPatterns(pattern);
    }
}
