//package com.micro.springsecuritydemo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GreetController {
//
//    @GetMapping("/greet")
//    public String greet() {
//        return "Hello from Greet";
//    }
//}

package com.micro.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello without login!";
    }

    @GetMapping("/secure")
    public String secure() {
        return "You are logged in and seeing a secure page.";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin-only page (but we didn’t restrict role in this example).";
    }
}
