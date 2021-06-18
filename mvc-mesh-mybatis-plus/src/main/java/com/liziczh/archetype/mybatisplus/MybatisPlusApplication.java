package com.liziczh.archetype.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.archetype.redis.RedisApplication;

@SpringBootApplication
public class MybatisPlusApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RedisApplication.class };
		SpringApplication.run(sources, args);
	}
}
