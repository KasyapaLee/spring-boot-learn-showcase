package com.dobby.rabbitmq.object;

import com.dobby.rabbitmq.common.User;
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
@RabbitListener(queues = "object-queue")
public class ObjectReceiver {


    @RabbitHandler
    public void execute(User user) {
        System.out.println("我是接收者，我接收到：" + user);
    }
}
