package com.zb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class MyProapplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProapplication.class,args);
    }
}
