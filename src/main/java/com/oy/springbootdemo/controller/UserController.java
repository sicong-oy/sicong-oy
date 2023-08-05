package com.oy.springbootdemo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.oy.springbootdemo.annotation.Myannotion;
import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    int a;
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    private void addUser(@RequestBody UserDTO userDTO){

    }

    @GetMapping("/findAll")
    @Myannotion
    public List<User> selectUser(){
        userService.addUser(null);
        User user = new User();
//        user.test();
        List<User> list = userService.list();
        Page page = new Page();
        return list;
    }

    @GetMapping("/login")
    private ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login.html");
        return modelAndView;
    }


    @GetMapping("/testThread")
    private String testThread(){
        userService.testThread();
        ModelAndView modelAndView = new ModelAndView("login.html");
        return "modelAndView";
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            System.out.println(Thread.currentThread().getName()+":"+i);
                        }
                    }
                }
        ).start();

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 1000; i++) {
                            System.out.println(i);
                        }
                    }
                }
        ).run();
    }

}
