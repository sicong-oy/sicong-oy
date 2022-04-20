package com.oy.springbootdemo;

import com.oy.springbootdemo.entity.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        //使用restTemplate发送http请求
        List<User> forObject = restTemplate.getForObject("http://localhost:8080/user/findAll", List.class);
        System.out.println(forObject);
    }

}
