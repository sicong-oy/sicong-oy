package com.oy.springbootdemo.controller;

import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("/add")
    private void addUser(@RequestBody User user){
        userService.addUser(user);
    }
    @GetMapping("/findAll")
    private List<User> selectUser(){
        return null;
    }
}
