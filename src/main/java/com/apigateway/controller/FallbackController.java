package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("user-fallback")
    public String userServiceFallback() {
        return "Oops! User Service is down currently.";
    }

    @GetMapping("contact-fallback")
    public String contactServiceFallback() {
        return "Oops! Contact Service is down currently.";
    }
}
