package com.oy.springbootdemo.service.impl;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("myThread");
    }
}
