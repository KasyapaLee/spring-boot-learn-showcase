package com.dobby.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *      Topic Exchange MQ 配置
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Configuration
public class TopicRabbitConfig {


    public final static String TOPIC_ONE = "topic.one";
    public final static String TOPIC_TWO = "topic.two";
    public final static String TOPIC_EXCHANGE = "topicExchange";


    /**
     * 定义队列
     * @return
     */
    @Bean
    public Queue queueOne(){
        return new Queue(TOPIC_ONE);
    }

    @Bean
    public Queue queueTwo(){
        return new Queue(TOPIC_TWO);
    }

    /**
     * 定义交换机
     * @return
     */
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(TOPIC_EXCHANGE);
    }



    /**
     * 定义绑定关系
     */
    @Bean
    Binding bindExchangeOne(Queue queueOne, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueOne).to(topicExchange).with("topic.one");
    }

    /**
     * 定义绑定关系
     * # 表示零个或多个词
     * * 表示一个词
     */
    @Bean
    Binding bindExchangeTwo(Queue queueTwo, TopicExchange topicExchange) {
        return BindingBuilder.bind(queueTwo).to(topicExchange).with("topic.#");
    }
}
