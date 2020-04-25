package com.dobby.rabbitmq.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 *
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Configuration
public class FanoutRabbitConfig {

    /**
     * 定义队列
     */

    @Bean
    public Queue aMessageQueue() {
        return new Queue("fanout.A");
    }

    @Bean
    public Queue bMessageQueue() {
        return new Queue("fanout.B");
    }

    @Bean
    public Queue cMessageQueue() {
        return new Queue("fanout.C");
    }

    /**
     * 定义交换机
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }


    /**
     * 绑定
     */

    @Bean
    public Binding bindingExchangeA(Queue aMessageQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(aMessageQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingExchangeB(Queue bMessageQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(bMessageQueue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingExchangeC(Queue cMessageQueue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(cMessageQueue).to(fanoutExchange);
    }
}
