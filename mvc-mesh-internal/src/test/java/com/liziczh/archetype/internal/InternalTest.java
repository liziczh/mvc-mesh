package com.liziczh.archetype.internal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liziczh.archetype.mybatisplus.MybatisPlusApplication;
import com.liziczh.archetype.redis.RedisApplication;
import com.liziczh.archetype.ref.RefApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(classes = { MybatisPlusApplication.class, RedisApplication.class, RefApplication.class, InternalApplication.class })
@SpringBootTest
@ActiveProfiles("test")
public class InternalTest {
	@Test
	void InternalTest() {
	}
}
