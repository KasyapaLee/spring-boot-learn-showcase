package com.dobby.rabbitmq.topic;

import com.dobby.rabbitmq.common.User;
import com.dobby.rabbitmq.config.TopicRabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
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
public class TopicSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 这个消息
     */
    public void sendOne() {
        String msg = "Hi, I am message one";
        System.out.println("我是发送者，我发送:"+msg);
        /**
         * 第一个参数: 路由key
         * 第二个参数：发送的消息
         */
        this.amqpTemplate.convertAndSend(TopicRabbitConfig.TOPIC_EXCHANGE, "topic.one", msg);
    }


    public void sendTwo() {
        String msg = "Hi, I am message two";
        System.out.println("我是发送者，我发送:"+msg);
        /**
         * 第一个参数: 路由key
         * 第二个参数：发送的消息
         */
        this.amqpTemplate.convertAndSend(TopicRabbitConfig.TOPIC_EXCHANGE, "topic.#", msg);
    }
}
