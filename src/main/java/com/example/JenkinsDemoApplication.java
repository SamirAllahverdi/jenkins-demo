package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

    @GetMapping
    public String get() {
        return "Hello World!";
    }

    //TODO: application.yaml
    //TODO: liquibase
    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
