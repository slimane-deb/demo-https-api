package com.example.demohttpsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public String welcome() {
       return "Welcome To Secured REST Service";
    }
}
