package com.dobby.rabbitmq.common;

import lombok.Data;
import lombok.ToString;

/**
 * <p>
 *
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Data
@ToString
public class User {

    private Long id;
    private String name;
    private String password;
    private int age;
    private String email;

}
