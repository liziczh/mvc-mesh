package com.liziczh.mvc.mesh.web.controller;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.api.req.DemoAddReq;
import com.liziczh.mvc.mesh.api.req.DemoInfoReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.api.req.DemoUpdateReq;
import com.liziczh.mvc.mesh.api.service.DemoApiService;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RequestMapping(value = "/api/demo/v1.0")
public class DemoController {

    @Autowired
    private DemoApiService demoApiService;

    @ApiOperation(value = "测试接口", notes = "测试接口")
    @GetMapping(value = "/hello")
    public BaseResponse<String> hello() {
        return ResponseBuilder.success("Hello World");
    }

    @ApiOperation(value = "分页条件查询", notes = "分页条件查询")
    @PostMapping(value = "/page")
    public BaseResponse<List<DemoDTO>> pageQuery(@RequestBody DemoQueryReq req) throws Exception {
        return demoApiService.pageQuery(req);
    }

    @ApiOperation(value = "查询单条记录接口", notes = "查询单条记录接口")
    @GetMapping(value = "/get/{demoId}")
    public BaseResponse<DemoDTO> getByDemoId(@PathVariable Long demoId) throws Exception {
        Long userId = 0L;
        DemoInfoReq req = DemoInfoReq.builder().demoId(demoId).userId(userId).build();
        return demoApiService.getDemo(req);
    }

    @ApiOperation(value = "新增接口", notes = "新增接口")
    @PostMapping(value = "/add")
    public BaseResponse<DemoOptDTO> addDemo(@RequestBody DemoAddReq req) throws Exception {
        return demoApiService.addDemo(req);
    }

    @ApiOperation(value = "更新接口", notes = "更新接口")
    @PutMapping(value = "update")
    public BaseResponse<DemoOptDTO> updateDemo(@RequestBody DemoUpdateReq req) throws Exception {
        return demoApiService.updateDemo(req);
    }

    @ApiOperation(value = "删除接口", notes = "删除接口")
    @DeleteMapping(value = "/delete/{id}")
    public BaseResponse<Void> deleteById(@PathVariable Long id) throws Exception {
        return demoApiService.deleteById(id);
    }
}
