package com.liziczh.archetype.mgm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liziczh.archetype.api.condition.DemoCondition;
import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.mgm.service.DemoMgmService;
import com.liziczh.base.common.service.BaseMgmService;
import com.liziczh.base.mvc.controller.BaseMgmController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/demo/")
@RestController
public class DemoController extends BaseMgmController<TDemo, Integer, DemoCondition> {
	@Autowired
	private DemoMgmService demoMgmService;

	@Override
	public String getIndex() {
		return "modules/demo/demo.html";
	}
	@Override
	public BaseMgmService<TDemo, Integer, DemoCondition> getService() {
		return demoMgmService;
	}
}
