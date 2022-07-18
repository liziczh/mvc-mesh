package com.liziczh.mvc.mesh.web.controller;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.redis.service.DemoRedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 示例Controller
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:50 下午
 */
@Api(value = "示例接口", tags = "示例接口")
@RestController
@RequestMapping(value = "/api/cache/v1.0")
public class CacheController {

    @Autowired
    private DemoRedisService demoRedisService;

    @ApiOperation(value = "缓存", notes = "缓存")
    @GetMapping(value = "/cache/{key}/{value}")
    public BaseResponse<Void> cache(@PathVariable String key, @PathVariable String value) {
        demoRedisService.setValue(key, value);
        return ResponseBuilder.success();
    }

}
