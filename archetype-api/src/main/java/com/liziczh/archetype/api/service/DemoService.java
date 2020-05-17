package com.liziczh.archetype.api.service;

import com.liziczh.archetype.api.entity.TDemo;

public interface DemoService {
	/**
	 * 获取Demo
	 * @param id id
	 * @return TDemo
	 * @throws Exception 异常
	 */
	TDemo getDemo(String id) throws Exception;
	/**
	 * 缓存Demo
	 * @param key key
	 * @param value value
	 */
	void setDemoRedisValue(String key, String value);
}
