package com.mywork.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProducerController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello from Producer!";
    }
}
