package com.zsl.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
/*@EnableDiscoveryClient :启用服务注册与发现
@EnableFeignClients：启用feign进行远程调用*/
@EnableDiscoveryClient
@EnableFeignClients
public class Test2Application {

    public static void main(String[] args) {
        SpringApplication.run(Test2Application.class, args);
    }

}
