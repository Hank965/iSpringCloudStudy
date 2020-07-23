package com.nacos.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String getHello(String name) {

//        String url = "http://localhost:8858/hello?people=" + name;
        String url = "http://nacos-provider/hello?people=" + name;

        return restTemplate.getForObject(url, String.class);
    }
}


