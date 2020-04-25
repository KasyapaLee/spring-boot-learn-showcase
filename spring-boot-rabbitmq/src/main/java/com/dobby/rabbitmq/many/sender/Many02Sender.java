package com.dobby.rabbitmq.many.sender;

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
public class Many02Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String msg = "多次发送消息，这个消息的序号是：" + i;
        System.out.println("我是发送者02，我发送:" + msg);

        /**
         * 第一个参数: 路由key
         * 第二个参数：发送的消息
         */
        this.amqpTemplate.convertAndSend("many-queue", msg );
    }
}
