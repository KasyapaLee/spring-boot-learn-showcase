package com.dobby.rabbitmq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Component
public class FanoutSender {


    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        String msg = "Hi, I am Fanout Msg";
        System.out.println("我是发送者，我发送:"+msg);
        this.amqpTemplate.convertAndSend("fanoutExchange", "xxx.xxs", msg);
    }
}
