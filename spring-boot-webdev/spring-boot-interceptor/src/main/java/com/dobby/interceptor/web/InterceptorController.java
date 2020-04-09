package com.dobby.interceptor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @GetMapping("/first/a")
    public String firsta() {
        return "/first/a";
    }

    @GetMapping("/first/b")
    public String firstb() {
        return "/first/b";
    }


    @GetMapping("/second/a")
    public String seconda() {
        return "/second/a";
    }

    @GetMapping("/second/b")
    public String secondb() {
        return "/second/b";
    }

}
