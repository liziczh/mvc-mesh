package com.liziczh.archetype.service.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.api.service.DemoService;
import com.liziczh.archetype.dao.mapper.TDemoMapper;

public class DemoServiceImpl implements DemoService {
	@Autowired
	private TDemoMapper demoMapper;

	@Override
	public TDemo getDemo(Integer id) throws Exception {
		return demoMapper.get(id);
	}
}
