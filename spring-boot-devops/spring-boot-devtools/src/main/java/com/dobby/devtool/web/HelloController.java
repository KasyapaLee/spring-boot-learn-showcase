package com.dobby.devtool.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liguoqing
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String test() {
        return "Spring Boot DevTools";
    }
}
