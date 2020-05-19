package com.liziczh.archetype.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liziczh.archetype.api.entity.TDemo;
import com.liziczh.archetype.api.service.DemoService;
import com.liziczh.base.common.controller.BaseController;
import com.liziczh.base.common.result.Result;
import com.liziczh.base.common.result.ResultBuilder;

import io.swagger.annotations.ApiOperation;

@RequestMapping(value = "/demo/")
@RestController
public class DemoController extends BaseController {
	@Autowired
	private DemoService demoService;

	@ApiOperation(value = "hello", notes = "hello", tags = "v1.0.0")
	@GetMapping(value = "hello")
	public Result<String> hello() {
		return new ResultBuilder<String>().complete("HelloWorld");
	}
	@ApiOperation(value = "addDemo", notes = "addDemo", tags = "v1.0.0")
	@PostMapping(value = "add")
	public Result<String> addDemo(TDemo demo) throws Exception {
		demoService.addDemo(demo);
		return new ResultBuilder<String>().success();
	}
	@ApiOperation(value = "updateDemo", notes = "updateDemo", tags = "v1.0.0")
	@PutMapping(value = "update")
	public Result<String> updateDemo(TDemo demo) throws Exception {
		demoService.updateDemo(demo);
		return new ResultBuilder<String>().success();
	}
	@ApiOperation(value = "getDemo", notes = "getDemoById", tags = "v1.0.0")
	@GetMapping(value = "/get/{id}")
	public Result<TDemo> getDemo(@PathVariable String id) throws Exception {
		TDemo demo = demoService.getDemo(id);
		return new ResultBuilder<TDemo>().complete(demo);
	}
	@ApiOperation(value = "deleteDemo", notes = "deleteDemoById", tags = "v1.0.0")
	@GetMapping(value = "/delete/{id}")
	public Result<String> deleteDemo(@PathVariable String id) throws Exception {
		demoService.deleteDemo(id);
		return new ResultBuilder<String>().success();
	}
	@ApiOperation(value = "cacheKey", notes = "cacheKey", tags = "v1.0.0")
	@GetMapping(value = "/cache/{key}/{value}")
	public Result<String> cache(@PathVariable String key, @PathVariable String value) throws Exception {
		demoService.setDemoRedisValue(key, value);
		return new ResultBuilder<String>().success();
	}
	@ApiOperation(value = "ref/hello", notes = "ref/hello", tags = "v1.0.0")
	@PostMapping(value = "ref/hello")
	public Result<String> refHello() {
		String hello = demoService.refHello();
		return new ResultBuilder<String>().complete(hello);
	}
}
