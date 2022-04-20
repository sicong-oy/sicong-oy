package com.oy.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.entity.po.User;


public interface UserService extends IService<User> {
    void addUser(UserDTO userDTO);
}
