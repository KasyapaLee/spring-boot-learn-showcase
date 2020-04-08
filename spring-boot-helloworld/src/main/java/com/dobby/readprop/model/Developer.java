package com.dobby.readprop.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类型安全的属性配置
 * @PropertySource ： 指定读取的属性文件
 * @ConfigurationProperties ： 定义属性的前缀标识
 */
@ConfigurationProperties(prefix = "developer")
@PropertySource("classpath:config.properties")
@Component
@Data
@ToString
public class Developer {

    private String username;
    private String email;

    private List<String> techs;

    private List<Computer> computers;

}
