package com.dobby.rabbitmq.hello.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <p>
 *   hello 消息接收者
 *   @RabbitListener 指定监听的队列
 *   @RabbitHandler  指定接收到消息后，处理的方法
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Component
@RabbitListener(queues = "hello-queue")
public class HelloReceiver {


    @RabbitHandler
    public void execute(String msg) {
        System.out.println("我是接收者，我接收到：" + msg);
    }
}
