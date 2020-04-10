package com.dobby.redis.service;

import com.dobby.redis.model.User;
import com.dobby.redis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;



    @CacheEvict(value = "realTimeCache", allEntries = true)
    @Transactional(rollbackOn = Exception.class)
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }


    @Cacheable(value = "realTimeCache", key = " 'user_' + #id")
    @Override
    public User findById(Long id) {
        System.out.println("从数据库中查询数据");
        return userRepository.findById(id).get();
    }


    /**
     * 双重检测锁
     * 解决热点缓存问题
     */
    @Override
    public int countUser() {
        BoundValueOperations<Object, Object> ops = redisTemplate.boundValueOps("count");
        // get from cache
        Object count = ops.get();
        if (count == null) {
            synchronized (this) {
                // get from cache
                count = ops.get();
                if (count == null) {
                    // get from db
                    count = userRepository.count();
                    // save cache
                    ops.set(count, 10, TimeUnit.SECONDS);
                }
            }
        }
        return ((Long) count).intValue();
    }
}
