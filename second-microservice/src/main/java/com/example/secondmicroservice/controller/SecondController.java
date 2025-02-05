package com.example.secondmicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class SecondController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String getData() {
        return instanceId;
    }
}
