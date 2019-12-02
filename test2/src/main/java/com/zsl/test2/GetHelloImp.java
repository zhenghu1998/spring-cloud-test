package com.zsl.test2;

import com.zsl.test2.Inter.GetHello;
import org.springframework.stereotype.Component;

@Component
public class GetHelloImp implements GetHello {

    @Override
    public String hello(String name) {
        return "加载中";
    }
}
