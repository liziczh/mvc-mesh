package com.liziczh.mvc.mesh.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.api.req.DemoCommandReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.api.service.DemoApiService;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.bo.opt.DemoOptBO;
import com.liziczh.mvc.mesh.service.convertor.DemoApiConvertor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoApiServiceImpl implements DemoApiService {

    @Autowired
    private com.liziczh.mvc.mesh.service.service.DemoService demoService;

    @Autowired
    private DemoApiConvertor demoApiConvertor;

    @Override
    public BaseResponse<List<DemoDTO>> queryPage(DemoQueryReq req) {
        BaseResponse<List<DemoBO>> response = demoService.queryPage(req);
        return ResponseBuilder.success(demoApiConvertor.toDTOList(response.getData()));
    }

    @Override
    public BaseResponse<DemoDTO> getDemo(Long demoId) {
        BaseResponse<DemoBO> response = demoService.getDemo(demoId);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<DemoOptDTO> addDemo(DemoCommandReq req) {
        BaseResponse<DemoOptBO> response = demoService.addDemo(req);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<DemoOptDTO> updateDemo(DemoCommandReq demo) {
        BaseResponse<DemoOptBO> response = demoService.updateDemo(demo);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<DemoOptDTO> deleteDemo(Long demoId) {
        BaseResponse<DemoOptBO> response = demoService.deleteDemo(demoId);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<String> refTest() {
        return demoService.refTest();
    }

}
