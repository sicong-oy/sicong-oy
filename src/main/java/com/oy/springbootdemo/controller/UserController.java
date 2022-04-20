package com.oy.springbootdemo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.entity.po.User;
import com.oy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    private void addUser(@RequestBody UserDTO userDTO){
        userService.addUser(userDTO);
    }
    @GetMapping("/findAll")
    private List<User> selectUser(){
        List<User> list = userService.list();
        return list;
    }

    @GetMapping("/login")
    private ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("index.html");
        return modelAndView;
    }

}
