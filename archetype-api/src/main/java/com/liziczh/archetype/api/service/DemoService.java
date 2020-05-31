package com.liziczh.archetype.api.service;

import java.util.List;

import com.liziczh.archetype.api.entity.TDemo;

public interface DemoService {
	/**
	 * 查询全部Demo
	 * @return TDemo
	 * @throws Exception 异常
	 */
	List<TDemo> getAll() throws Exception;
	/**
	 * 新增实体
	 * @param demo 实体
	 * @return pk
	 * @throws Exception
	 */
	Integer addDemo(TDemo demo) throws Exception;
	/**
	 * 更新实体
	 * @param demo 实体
	 * @throws Exception 异常
	 */
	void updateDemo(TDemo demo) throws Exception;
	/**
	 * 获取Demo
	 * @param id id
	 * @return TDemo
	 * @throws Exception 异常
	 */
	TDemo getDemo(String id) throws Exception;
	/**
	 * 删除Demo
	 * @param id id
	 * @throws Exception 异常
	 */
	void deleteDemo(String id) throws Exception;
	/**
	 * 缓存Demo
	 * @param key key
	 * @param value value
	 */
	void setDemoRedisValue(String key, String value);
	/**
	 * 获取缓存值
	 * @param key K
	 * @return V
	 */
	String getDemoRedisValue(String key);
	/**
	 * 是否存在key
	 * @param key key
	 * @return 是否存在
	 */
	Boolean hasDemoKey(String key);
	/**
	 * 删除key
	 * @param key key
	 */
	void delDemoKey(String key);
	/**
	 * REF测试
	 * @return helloworld
	 */
	String refHello();
}
