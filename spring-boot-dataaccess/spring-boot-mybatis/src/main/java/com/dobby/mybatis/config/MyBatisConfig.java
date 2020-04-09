package com.dobby.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@MapperScan("com.dobby.mybatis.mapper")
@Configuration
public class MyBatisConfig {

}
