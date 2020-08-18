package com.liziczh.arcehtype.jpa;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.liziczh.arcehtype.jpa.entity.TDemo2;
import com.liziczh.arcehtype.jpa.repository.TDemoRepository;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = SpringDataJpaApplication.class)
@SpringBootTest
@ActiveProfiles("test")
class SpringDataJpaTest {
	@Autowired
	private TDemoRepository tDemoRepository;

	@Test
	public void findTest() {
		tDemoRepository.findAll();
	}
	@Test
	public void saveTest() {
		TDemo2 tDemo2 = new TDemo2();
		tDemo2.setName("栗子");
		tDemo2.setCreateTime(new Date());
		tDemo2.setCreateUser("zhehao.chen");
		tDemoRepository.save(tDemo2);
	}
}
