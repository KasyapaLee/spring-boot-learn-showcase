package com.dobby.rabbitmq.hello.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>
 *      消息发送者
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String msg = "你好，这是一个String类型的信息";
        System.out.println("我是发送者，我发送:" + msg);

        /**
         * 第一个参数: 路由key
         * 第二个参数：发送的消息
         */
        this.amqpTemplate.convertAndSend("hello-queue", msg );
    }
}
