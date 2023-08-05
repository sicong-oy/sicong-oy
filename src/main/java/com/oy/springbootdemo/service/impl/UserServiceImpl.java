package com.oy.springbootdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.oy.springbootdemo.dao.UserDao;
import com.oy.springbootdemo.entity.User;
import com.oy.springbootdemo.entity.UserDTO;
import com.oy.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Resource
    private UserDao userDao;


    @Override
    public void addUser(UserDTO userDTO) {

    }

    @Override
    public void testThread() {
        //1.1创建固定线程个数的线程池
        //ExecutorService es=Executors.newFixedThreadPool(4);
        //1.2创建缓存线程池，线程个数由任务个数决定
        ExecutorService es = Executors.newCachedThreadPool();
        //1.3创建单线程线程池
        //Executors.newSingleThreadExecutor();
        //1.4创建调度线程池  调度:周期、定时执行
        //Executors.newScheduledThreadPool(corePoolSize)
        Executors.newScheduledThreadPool(3);
        //2创建任务
        Runnable runnable = new Runnable() {
            private int ticket = 100;

            @Override
            public void run() {
                while (true) {
                    if (ticket <= 0) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + "买了第" + ticket + "张票");
                    ticket--;
                }
            }
        };
        //3提交任务
        for (int i = 0; i < 5; i++) {
            es.submit(runnable);
        }
        //4关闭线程池
        es.shutdown();//等待所有任务执行完毕 然后关闭线程池，不接受新任务。
    }
}
