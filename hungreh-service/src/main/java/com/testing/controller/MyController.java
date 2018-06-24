package com.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    private RestTemplate restTemplate;
    private int mockPort;

    @Autowired
    public MyController(RestTemplate restTemplate, @Value("${mockPort}") int mockPort) {
        this.restTemplate = restTemplate;
        this.mockPort = mockPort;
    }

    @GetMapping("/")
    public String whatevas() {
        return restTemplate.getForEntity(String.format("http://localhost:%d/myMock", mockPort), String.class).getBody();
    }
}
