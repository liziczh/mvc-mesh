package com.liziczh.archetype.api.service;

import java.util.List;

import com.liziczh.archetype.api.condition.DemoCondition;
import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.base.common.service.BaseService;

public interface DemoService extends BaseService {
	/**
	 * 条件查询
	 * @return TDemo
	 * @throws Exception 异常
	 */
	List<TDemo> selectByCondition(DemoCondition condition) throws Exception;
	/**
	 * 查询全部
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
	 * 查询单个实体
	 * @param id id
	 * @return TDemo
	 * @throws Exception 异常
	 */
	TDemo getDemo(String id) throws Exception;
	/**
	 * 删除实体
	 * @param id id
	 * @throws Exception 异常
	 */
	void deleteDemo(String id) throws Exception;
	/**
	 * 缓存
	 * @param key key
	 * @param value value
	 */
	void setDemoRedisValue(String key, String value);
	/**
	 * 查询缓存值
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
