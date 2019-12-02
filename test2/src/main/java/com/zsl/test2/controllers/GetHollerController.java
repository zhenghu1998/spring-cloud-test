package com.zsl.test2.controllers;

import com.zsl.test2.Inter.GetHello;
import com.zsl.test2.Inter.getBusiness;
import com.zsl.test2.entytis.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class GetHollerController {
    @Resource
    GetHello getHello;
    @Autowired
    getBusiness getBusiness;
   @RequestMapping(value = "/hello/{name}")
   public String getHello(@PathVariable("name") String name){
       return "这里拿到了test1的服务"+getHello.hello(name);
   }

   @RequestMapping(value = "/Business/{id}")
    public Business getBusiness(@PathVariable("id") String id){
       return getBusiness.findBusinessById(id);
   }
}
