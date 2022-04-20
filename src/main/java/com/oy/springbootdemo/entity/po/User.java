package com.oy.springbootdemo.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Long id;
    private String username;
    private String password;
}
