package com.personal.openshiftpoc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    @GetMapping
    public String greetings() {
        return "Greetings from OpenShift POC!";
    }
}
