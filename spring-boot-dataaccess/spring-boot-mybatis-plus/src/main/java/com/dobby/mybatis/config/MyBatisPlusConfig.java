package com.dobby.mybatis.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.sun.org.apache.regexp.internal.RE;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@MapperScan("com.dobby.mybatis.mapper")
@Configuration
public class MyBatisPlusConfig {


    /**
     * MyBaits Plus 分页插件配置
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}
