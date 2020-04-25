package com.dobby.rabbitmq.object;

import com.dobby.rabbitmq.common.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 *      消息发送者
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user) {
        System.out.println("我是发送者，我发送对象信息:"+user);

        /**
         * 第一个参数: 路由key
         * 第二个参数：发送的消息
         */
        this.amqpTemplate.convertAndSend("object-queue", user);
    }
}
