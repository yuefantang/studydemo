package com.tyf.studydemo.redisdemo.redis.service.impl;

import com.tyf.studydemo.redisdemo.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * TODO:请添加描述
 *
 * @author TYF
 * @date 2018/11/29
 * @since 1.0.0
 */
@Service
public class redisServiceImpl implements RedisService {

    //@Resource(name = "redisStringTemplate")
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * redis对map的操作
     */
    @Override
    public void operationMap() {

    }

    /**
     * redis对set的操作
     */
    @Override
    public void operationSet() {

    }

    /**
     * redis对list的操作
     */
    @Override
    public void operationList() {

    }

    /**
     * redis对String的操作
     */
    @Override
    public void operationString() {
        stringRedisTemplate.opsForValue().set("aa", "bj");
    }
}
