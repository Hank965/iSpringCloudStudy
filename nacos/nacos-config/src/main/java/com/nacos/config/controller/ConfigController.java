package com.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${nacos.cofing.name}")
    private String name;

    @Value("${nacos.cofing.function}")
    private String book;

    @GetMapping("/name")
    public String getName() {

        return name;
    }

    @GetMapping("/function")
    public String getFunction() {

        return book;
    }
}
