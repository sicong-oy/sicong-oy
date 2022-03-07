package com.oy.springbootdemo.service.impl;

import com.oy.springbootdemo.dao.UserDao;
import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
