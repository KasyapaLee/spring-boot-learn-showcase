package com.dobby.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *      用户
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private String password;
    private int age;
    private String email;


}
