package com.liziczh.archetype.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liziczh.archetype.api.service.DemoService;
import com.liziczh.archetype.dao.DaoApplication;
import com.liziczh.archetype.redis.service.DemoRedisService;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(classes = { DaoApplication.class, ServiceApplication.class })
@SpringBootTest()
@ActiveProfiles("test")
@Slf4j
public class ServiceTest {
	@Autowired
	public DemoService demoService;

	@Test
	public void demoServiceTest() {
		try {
			demoService.getDemo(String.valueOf(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void demoRedisServiceTest() {
		demoService.setDemoRedisValue("service", "value");
	}
}
