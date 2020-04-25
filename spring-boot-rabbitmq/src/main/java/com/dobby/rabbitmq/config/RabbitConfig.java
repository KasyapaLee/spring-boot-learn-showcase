package com.dobby.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * <p>
 *      RabbitMQ配置。
 *      使用 默认的交换机。配置的规则是 routing-key 全文匹配寻找 队列
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/24
 */
@Configuration
public class RabbitConfig {


    @Bean
    public Queue helloQueue() {
        return new Queue("hello-queue");
    }


    @Bean
    public Queue manyQueue() {
        return new Queue("many-queue");
    }


    @Bean
    public Queue objectQueue() {
        return new Queue("object-queue");
    }

}
