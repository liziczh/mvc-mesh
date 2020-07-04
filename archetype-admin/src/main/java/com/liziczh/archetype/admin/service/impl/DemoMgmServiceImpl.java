package com.liziczh.archetype.admin.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.archetype.admin.service.DemoMgmService;
import com.liziczh.archetype.api.common.Constants;
import com.liziczh.archetype.api.condition.DemoCondition;
import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.dao.mapper.TDemoMapper;

@Service
public class DemoMgmServiceImpl implements DemoMgmService {
	@Autowired
	private TDemoMapper demoMapper;

	@Override
	public List<TDemo> selectByCondition(DemoCondition condition) {
		return demoMapper.selectByCondition(condition);
	}
	@Override
	public List<TDemo> getAll() {
		return demoMapper.getAll();
	}
	@Override
	public void addItem(TDemo entity) {
		entity.setCreateTime(new Date());
		entity.setCreateUser(Constants.SYS_USER);
		entity.setValid(Constants.COMMON_STATUS.VALID.getCode());
		demoMapper.insert(entity);
	}
	@Override
	public void updateItem(TDemo entity) {
		entity.setUpdateTime(new Date());
		entity.setUpdateUser(Constants.SYS_USER);
		demoMapper.update(entity);
	}
	@Override
	public TDemo get(Integer id) {
		return demoMapper.get(id);
	}
	@Override
	public void delete(Integer id) {
		demoMapper.delete(id);
	}
}
