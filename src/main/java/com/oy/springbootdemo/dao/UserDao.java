package com.oy.springbootdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.oy.springbootdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<User> {

}
