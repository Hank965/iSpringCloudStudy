package com.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class NacosProviderController {

    @GetMapping("hello")
    public String hello(String people) {

        String result = "hello:" + people;
        System.out.println((new Date()) + result);
        return result;
    }

}
