package com.oy.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oy.springbootdemo.dao.UserDao;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.entity.po.User;
import com.oy.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setPassword(userDTO.getPassword());
        user.setUsername(userDTO.getUserName());
        userDao.insert(user);
    }
}
