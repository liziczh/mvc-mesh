package com.liziczh.archetype.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.archetype.mybatisplus.MybatisPlusApplication;
import com.liziczh.archetype.redis.RedisApplication;
import com.liziczh.archetype.ref.RefApplication;

@SpringBootApplication
public class InternalApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RedisApplication.class, RefApplication.class, InternalApplication.class };
		SpringApplication.run(sources, args);
	}
}
