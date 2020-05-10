package com.liziczh.archetype.dao;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DaoApplicationTests {
	@Autowired
	private TDemoMapper demoMapper;
	@Test
	void DemoTest() {
		demoMapper.getDemoById(1);
	}
}
