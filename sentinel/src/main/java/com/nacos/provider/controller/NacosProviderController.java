package com.nacos.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosProviderController {

    Logger log = LoggerFactory.getLogger(NacosProviderController.class);

    @GetMapping("/hello")
    @SentinelResource(value = "/hello")
    public String hello(String people) {

        String result = "hello:" + people;
        log.info(result);

        return result;
    }

    @GetMapping("/help")
    @SentinelResource(value = "/help")
    public String help(@RequestParam("people") String peopleName) {

        String result = "what can i help you : " + peopleName;
        log.info(result);

        return result;
    }

}
