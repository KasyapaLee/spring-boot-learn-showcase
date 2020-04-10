package com.dobby.redis.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author liguoqing
 */
@Data
@Entity
@Table(name = "t_users")
public class User implements Serializable {


    @Id
    private Long id;
    private String name;
    private String password;
    private int age;

}
