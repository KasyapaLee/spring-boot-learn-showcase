package com.dobby.mybatis.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * @author liguoqing
 */
@Data
@TableName("t_users")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String name;
    private String password;
    private int age;


}
