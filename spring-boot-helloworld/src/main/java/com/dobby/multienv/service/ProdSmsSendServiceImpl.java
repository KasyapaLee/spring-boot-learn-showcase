package com.dobby.multienv.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 生产环境实现
 */
@Service
@Profile("prod")
public class ProdSmsSendServiceImpl implements SmsSendService {

    @Override
    public String send() {
        return "send sms from prod env";
    }
}
