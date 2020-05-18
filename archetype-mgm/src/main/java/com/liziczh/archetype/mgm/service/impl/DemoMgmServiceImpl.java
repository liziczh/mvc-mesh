package com.liziczh.archetype.mgm.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.archetype.api.common.Constants;
import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.dao.mapper.TDemoMapper;
import com.liziczh.archetype.mgm.service.DemoMgmService;

@Service
public class DemoMgmServiceImpl implements DemoMgmService {
	@Autowired
	private TDemoMapper demoMapper;

	@Override
	public void addItem(TDemo entity) {
		entity.setCreateTime(new Date());
		entity.setCreateUser(Constants.SYS_USER);
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
