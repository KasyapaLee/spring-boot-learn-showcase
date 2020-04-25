package com.dobby.mybatis.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dobby.mybatis.entity.User;
import com.dobby.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author liguoqing
 * @since 2020/4/25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


}
