package com.oy.springbootdemo.dao;

import com.oy.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> findAll();

    void addUser(User user);
}
