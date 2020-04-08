package com.dobby.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {



    @RequestMapping("/500")
    public String error() {
        int result = 1/0;
        return "error";
    }



}
