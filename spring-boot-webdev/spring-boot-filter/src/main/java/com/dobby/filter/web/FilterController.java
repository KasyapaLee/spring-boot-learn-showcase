package com.dobby.filter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {



    @GetMapping("/hello")
    public String test() {
        return "Hello Spring Boot Filter";
    }
}
