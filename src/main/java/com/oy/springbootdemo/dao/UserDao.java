package com.oy.springbootdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oy.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserDao extends BaseMapper<User>  {
    List<User> selectUser();
    void batchDeleteUser(List<User> list);
}
