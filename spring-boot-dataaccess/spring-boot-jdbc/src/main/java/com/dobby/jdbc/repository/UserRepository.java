package com.dobby.jdbc.repository;

import com.dobby.jdbc.model.User;

import java.util.List;

/**
 * @author liguoqing
 */
public interface UserRepository {

    int save(User user);
    int update(User user);
    int delete(long id);
    List<User> findALL();
    User findById(long id);
}
