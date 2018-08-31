package com.yn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/hello")
    public String index() {
        return "Hello World";
    }

	@PostMapping("/hello")
    public String login() {
        return "Hello World is ok login";
    }
	
}
