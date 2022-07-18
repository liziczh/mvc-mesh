package com.liziczh.mvc.mesh.redis.service.impl;

import com.liziczh.mvc.mesh.redis.service.DemoRedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * DemoRedis服务
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:11 上午
 */
@Slf4j
@Service
public class DemoRedisServiceImpl implements DemoRedisService {

    @Resource(name = "redisTemplate")
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public void setValue(String key, String value) {
        redisTemplate.opsForValue().set(key, value, 300, TimeUnit.SECONDS);
    }

    @Override
    public String getValue(String key) {
        return String.valueOf(redisTemplate.opsForValue().get(key));
    }

    @Override
    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    @Override
    public void delKey(String key) {
        redisTemplate.delete(key);
    }
}
