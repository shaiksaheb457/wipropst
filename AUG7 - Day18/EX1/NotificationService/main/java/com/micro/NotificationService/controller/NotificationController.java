package com.micro.NotificationService.controller;

import com.micro.NotificationService.dto.NotificationRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public String notifyUser(@RequestBody NotificationRequest request) {
        String message = "User " + request.getUser().getUsername() + " is " + request.getAction();
        System.out.println(message);
        return message;
    }
}
