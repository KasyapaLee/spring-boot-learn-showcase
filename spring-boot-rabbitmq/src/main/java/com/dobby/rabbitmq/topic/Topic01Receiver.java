package com.dobby.rabbitmq.topic;

import com.dobby.rabbitmq.common.User;
import com.dobby.rabbitmq.config.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 *   消息接收者
 *   @RabbitListener 指定监听的队列
 *   @RabbitHandler  指定接收到消息后，处理的方法
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Component
public class Topic01Receiver {


    @RabbitHandler
    @RabbitListener(queues = TopicRabbitConfig.TOPIC_ONE)
    public void execute(String message) {
        System.out.println("我是接收者01，我接收到：" + message);
    }
}
