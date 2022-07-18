package com.oy.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        return null;
    }
//
//    @GetMapping("/login")
//    private ModelAndView login(){
//        ModelAndView modelAndView = new ModelAndView("login.html");
////        List<User> list = userService.list();
//        modelAndView.addObject("arr",list);
//        return modelAndView;
//    }


    @GetMapping("/testThread")
    private String testThread(){
        userService.testThread();
        return "modelAndView";
    }
}
