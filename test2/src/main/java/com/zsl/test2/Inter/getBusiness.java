package com.zsl.test2.Inter;

import com.zsl.test2.GetHelloImp;
import com.zsl.test2.entytis.Business;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Business")
public interface getBusiness {
    @RequestMapping(value = "/BusinessController/business/{id}",method = RequestMethod.GET)
    public Business findBusinessById(@PathVariable("id") String id);
}
