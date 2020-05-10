package com.liziczh.archetype.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.liziczh.archetype.dao.mapper.TDemoMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class DaoApplicationTest {
	@Autowired
	private TDemoMapper demoMapper;
	@Test
	void DemoTest() {
		demoMapper.get(1);
	}
}
