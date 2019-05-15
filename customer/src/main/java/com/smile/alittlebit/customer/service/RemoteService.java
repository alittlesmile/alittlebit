package com.smile.alittlebit.customer.service;


import com.smile.alittlebit.customer.hystrix.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "service-a",fallback = RemoteHystrix.class)
public interface RemoteService {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
