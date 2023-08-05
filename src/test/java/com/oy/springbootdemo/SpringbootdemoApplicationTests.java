package com.oy.springbootdemo;

import com.oy.springbootdemo.dao.UserDao;
import com.oy.springbootdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;


@SpringBootTest(classes = SpringbootdemoApplication.class)
@RunWith(SpringRunner.class)
class SpringbootdemoApplicationTests {
    @Resource
    private UserDao userDao;
    @Test
    public void content(){
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        HashMap hashMap = new HashMap();
        TreeSet treeSet = new TreeSet();
        ArrayList<Object> list = new ArrayList<>();
        List<User> users = userDao.selectUser();
        System.out.println(users);
    }
}
