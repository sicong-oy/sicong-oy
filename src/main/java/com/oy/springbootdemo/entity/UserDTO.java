package com.oy.springbootdemo.entity;

import lombok.Data;

@Data
public class UserDTO{
    private Integer pageSize;
    private String password;
    private String userName;
    private String sex;
    private Integer pageNum;
}
