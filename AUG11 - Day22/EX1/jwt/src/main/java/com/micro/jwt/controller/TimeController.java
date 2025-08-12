package com.micro.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
public class TimeController {

    @GetMapping("/getCurrentTime")
    public Map<String, String> getCurrentTime() {
        return Map.of("currentDateTime", LocalDateTime.now().toString());
    }
}
