package com.zsl.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//支持网关路由
@EnableZuulProxy
public class Test3Application {

    public static void main(String[] args) {
        SpringApplication.run(Test3Application.class, args);
    }

}
