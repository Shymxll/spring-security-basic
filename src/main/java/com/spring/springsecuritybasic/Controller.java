package com.spring.springsecuritybasic;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @org.springframework.web.bind.annotation.GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
