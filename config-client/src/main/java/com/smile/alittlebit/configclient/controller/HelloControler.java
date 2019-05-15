package com.smile.alittlebit.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return name;
    }
}
