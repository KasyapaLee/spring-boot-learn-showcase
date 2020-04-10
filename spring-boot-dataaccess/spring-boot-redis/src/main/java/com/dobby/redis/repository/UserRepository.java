package com.dobby.redis.repository;

import com.dobby.redis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author liguoqing
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
