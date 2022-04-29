package com.oy.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class SpringbootdemoApplicationTests {

    @Test
    void contextLoads() {
        int a = 3;
        int b = 5;
        int c = 7;
        int number = 100;
        int temp = 0;

        while(number>0){
            number = number%a;
            temp=temp+1;
        }

        while(temp>0){
            temp = temp%a;
        }
    }

    public class GetFileName {

        public static void main(String[] args) {
            //这是需要获取的文件夹路径
            String path = "G:\\imooc";
            getFile(path);
        }


        private static void getFile(String path){

        }
    }

}
