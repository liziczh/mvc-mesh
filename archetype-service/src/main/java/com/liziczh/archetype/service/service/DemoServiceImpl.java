package com.liziczh.archetype.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.api.service.DemoService;
import com.liziczh.archetype.dao.mapper.TDemoMapper;
import com.liziczh.archetype.redis.service.DemoRedisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private TDemoMapper demoMapper;
	@Autowired
	private DemoRedisService demoRedisService;

	@Override
	public TDemo getDemo(String id) throws Exception {
		return demoMapper.get(Integer.valueOf(id));
	}
	@Override
	public void setDemoRedisValue(String key, String value) {
		demoRedisService.setValue(key, value);
	}
}
