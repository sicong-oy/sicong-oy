package com.oy.springbootdemo.controller;

import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
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
        ModelAndView modelAndView = new ModelAndView("login.html");
        List<User> list = userService.list();
        modelAndView.addObject("arr",list);
        return modelAndView;
    }


    @GetMapping("/testThread")
    private String testThread(){
        userService.testThread();
        return "modelAndView";
    }
}
