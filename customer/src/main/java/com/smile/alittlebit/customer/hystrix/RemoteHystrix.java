package com.smile.alittlebit.customer.hystrix;

import com.smile.alittlebit.customer.service.RemoteService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;


@Component
public class RemoteHystrix implements RemoteService {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello"+name+",this is remote hystrix!";
    }
}
