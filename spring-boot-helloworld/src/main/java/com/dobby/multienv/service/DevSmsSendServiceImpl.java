package com.dobby.multienv.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 开发环境实现
 */
@Service
@Profile("dev")
public class DevSmsSendServiceImpl implements SmsSendService {

    @Override
    public String send() {
        return "send sms from dev env";
    }
}
