package com.tyf.studydemo.redisdemo.redis.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis配置
 *
 * @author TYF
 * @date 2018/11/29
 * @since 1.0.0
 */
@Configuration

public class RedisConfig {
    /**
     * 配置redisTemplate
     *
     * @param factory
     * @return
     */
    @Bean("redisStringTemplate")
    public RedisTemplate<String, String> stringRedisTemplate(@Qualifier("redisConnectionFactory") RedisConnectionFactory factory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(factory);
        return stringRedisTemplate;
    }

    @Bean("redisConnectionFactory")
    public RedisConnectionFactory connectionFactory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName("47.98.177.211");
        factory.setPort(6379);
        factory.setPassword("");
        factory.setDatabase(1);
        return factory;
    }

}


