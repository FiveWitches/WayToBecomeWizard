package com.fivewitches.waytobecomewizard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/helloapi")
    public String helloApi() {
        return "Hello World!";
    }
}
