package com.dobby.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dobby.mybatis.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @author liguoqing
 */
public interface UserMapper extends BaseMapper<User> {


    @Select({"SELECT * FROM t_users WHERE name = #{name}"})
    List<User> getByName(@Param("name") String name);


    List<User> getAll();

    List<User> getByAgeMoreThan(@Param("age") int age);

}
