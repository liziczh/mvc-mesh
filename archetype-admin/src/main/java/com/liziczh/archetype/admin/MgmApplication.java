package com.liziczh.archetype.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.liziczh.archetype.internal.InternalApplication;
import com.liziczh.archetype.mybatisplus.MybatisPlusApplication;
import com.liziczh.archetype.ref.RefApplication;

@SpringBootApplication
public class MgmApplication {
	public static void main(String[] args) {
		Class<?>[] sources = new Class<?>[] { MybatisPlusApplication.class, RefApplication.class, InternalApplication.class, MgmApplication.class };
		SpringApplication.run(sources, args);
	}
}
