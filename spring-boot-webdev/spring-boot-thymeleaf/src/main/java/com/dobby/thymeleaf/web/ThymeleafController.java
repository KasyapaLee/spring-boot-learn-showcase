package com.dobby.thymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {


    @RequestMapping("/hello")
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("message", "Hello Thymeleaf");
        return "hello";
    }

}
