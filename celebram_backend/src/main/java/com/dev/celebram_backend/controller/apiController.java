package com.dev.celebram_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apiController {
    @GetMapping("/user")
    public String test() {
        return "hello world" ;
    }


}
