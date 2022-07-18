package com.oy.springbootdemo;

import com.oy.springbootdemo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
class SpringbootdemoApplicationTests {
    @Autowired
    private UserDao userDao;
    @Test
    public void content(){
        userDao.selectUser();
    }
}
