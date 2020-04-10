package com.dobby.redis.model;

import lombok.Data;

/**
 * @author liguoqing
 */
@Data
public class User {

    private Long id;
    private String name;
    private String password;
    private int age;

}
