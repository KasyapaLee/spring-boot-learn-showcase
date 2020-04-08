package com.dobby.multienv.web;

import com.dobby.multienv.service.SmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/multienv")
public class MultiEnvController {

    @Autowired
    private SmsSendService smsSendService;

    @GetMapping("/send")
    public String send() {
        return smsSendService.send();
    }

}
