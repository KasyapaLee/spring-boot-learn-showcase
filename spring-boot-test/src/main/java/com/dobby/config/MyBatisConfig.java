package com.dobby.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@MapperScan("com.dobby.mapper")
@Configuration
public class MyBatisConfig {

}
