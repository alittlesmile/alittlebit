package com.smile.alittlebit.customer.controller;

import com.smile.alittlebit.customer.service.RemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    RemoteService remoteService;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return remoteService.hello(name);
    }
}
