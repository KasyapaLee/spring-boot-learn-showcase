package com.dobby.jsp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class JspController {


    @GetMapping("/jsp")
    public String jsp(ModelMap modelMap) {
        modelMap.put("time", new Date());
        modelMap.put("message", "Hello World");
        return "hello";
    }



}
