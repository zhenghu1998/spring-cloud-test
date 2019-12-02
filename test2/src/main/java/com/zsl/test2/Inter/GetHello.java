package com.zsl.test2.Inter;

import com.zsl.test2.GetHelloImp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 此类中的方法和远程服务中contoller中的方法名和参数需保持一致。
 * name:远程服务名，即spring.application.name配置的名称
 */
@FeignClient(name = "test1",fallback = GetHelloImp.class)
public interface GetHello {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name);
}
