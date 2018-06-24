package com.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    private RestTemplate restTemplate;
    private String dependencyUrl;

    @Autowired
    public MyController(RestTemplate restTemplate, @Value("${dependencyUrl}") String dependencyUrl) {
        this.restTemplate = restTemplate;
        this.dependencyUrl = dependencyUrl;
    }

    @GetMapping("/")
    public String whatevas() {
        return restTemplate.getForEntity(dependencyUrl, String.class).getBody();
    }
}
