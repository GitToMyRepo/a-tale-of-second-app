package com.mywork.ataleofsecondapp.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ServiceBController {
    @GetMapping("/service-b")
    public String getServiceB() {
        return "Hello from Service B!";
    }
}
