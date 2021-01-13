package com.liziczh.archetype.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.archetype.internal.InternalApplication;
import com.liziczh.archetype.mybatisplus.MybatisPlusApplication;
import com.liziczh.archetype.redis.RedisApplication;
import com.liziczh.archetype.ref.RefApplication;

@SpringBootApplication(scanBasePackages = { "com.liziczh.*" })
public class ServiceApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RedisApplication.class, RefApplication.class, InternalApplication.class, ServiceApplication.class };
		SpringApplication.run(sources, args);
	}
}
