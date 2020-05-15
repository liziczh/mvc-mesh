package com.liziczh.archetype.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.archetype.dao.DaoApplication;

@SpringBootApplication(scanBasePackages = { "com.liziczh.*" })
public class ServiceApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { DaoApplication.class, ServiceApplication.class };
		SpringApplication.run(sources, args);
	}
}
