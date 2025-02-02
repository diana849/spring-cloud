package com.example.firstmicroservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RefreshScope
public class FirstService {

    private final RestClient.Builder builder;

    @Value("${message:default value without config server}")
    private String message;

    public FirstService() {
        this.builder = RestClient.builder().baseUrl("http://localhost:8080/api/data");
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return builder.build()
                .get()
                .retrieve()
                .body(String.class);
    }
}
