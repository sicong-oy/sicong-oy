package com.oy.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.entity.UserDTO;


public interface UserService extends IService<User> {
    void addUser(UserDTO userDTO);

    void testThread();
}
