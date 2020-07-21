package com.liziczh.arcehtype.data.jpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = SpringDataJpaApplication.class)
@SpringBootTest
@ActiveProfiles("test")
class SpringDataJpaApplicationTest {
	@Test
	void contextLoads() {
	}
}
