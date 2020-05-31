package com.liziczh.archetype.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.api.service.DemoService;
import com.liziczh.archetype.dao.mapper.TDemoMapper;
import com.liziczh.archetype.redis.service.DemoRedisService;
import com.liziczh.archetype.ref.service.DemoRefService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {
	@Autowired
	private TDemoMapper demoMapper;
	@Autowired
	private DemoRedisService demoRedisService;
	@Autowired
	private DemoRefService demoRefService;

	@Override
	public List<TDemo> getAll() {
		return demoMapper.getAll();
	}
	@Override
	public Integer addDemo(TDemo demo) {
		return demoMapper.insert(demo);
	}
	@Override
	public void updateDemo(TDemo demo) {
		demoMapper.update(demo);
	}
	@Override
	public TDemo getDemo(String id) {
		return demoMapper.get(Integer.valueOf(id));
	}
	@Override
	public void deleteDemo(String id) {
		demoMapper.delete(Integer.valueOf(id));
	}
	@Override
	public void setDemoRedisValue(String key, String value) {
		demoRedisService.setValue(key, value);
	}
	@Override
	public String getDemoRedisValue(String key) {
		return demoRedisService.getValue(key);
	}
	@Override
	public Boolean hasDemoKey(String key) {
		return demoRedisService.hasKey(key);
	}
	@Override
	public void delDemoKey(String key) {
		demoRedisService.delKey(key);
	}
	@Override
	public String refHello() {
		return demoRefService.hello();
	}
}