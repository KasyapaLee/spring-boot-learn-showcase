package com.dobby.mybatis.mapper;


import com.dobby.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author liguoqing
 */
public interface UserMapper {


    @Select("select * from t_users")
    List<User> getAll();

    @Select({"SELECT * FROM t_users WHERE name = #{name}"})
    List<User> getByName(@Param("name") String name);

    List<User> getByAgeMoreThan(@Param("age") int age);

}
