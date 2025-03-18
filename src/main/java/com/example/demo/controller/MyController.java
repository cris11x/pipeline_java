package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Good, Bye!";
    }

    @GetMapping("/good")
    public String sayGood() {
        return "Good, Morning";
    }

    @GetMapping("/night")
    public String night() {
        return "good, night";
    }
}
