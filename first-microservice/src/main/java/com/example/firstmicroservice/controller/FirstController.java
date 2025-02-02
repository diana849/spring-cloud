package com.example.firstmicroservice.controller;

import com.example.firstmicroservice.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private final FirstService firstService;

    public FirstController(FirstService firstService) {
        this.firstService = firstService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return firstService.getMessage();
    }

    @GetMapping("/data")
    public String getData() {
        return firstService.getData();
    }
}
