package net.engineeringdigest.journalapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("health")
    public String  healthcheck(){
        return "OK";
    }
}
