package com.oy.springbootdemo.service;

import com.oy.springbootdemo.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    void addUser(User user);
}
