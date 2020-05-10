package com.liziczh.archetype.api.service;

import com.liziczh.archetype.api.entity.TDemo;

public interface DemoService {
	/**
	 * 获取Demo
	 * @param id id
	 * @return TDemo
	 * @throws Exception 异常
	 */
	public TDemo getDemo(Integer id) throws Exception;
}
