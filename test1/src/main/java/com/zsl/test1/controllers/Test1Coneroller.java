package com.zsl.test1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Coneroller {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return "hello"+name+"这是注册的hello服务1";
    }
}
