package com.liziczh.mvc.mesh.service.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.mvc.mesh.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.req.DemoCommandReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.service.bo.DemoBO;
import com.liziczh.mvc.mesh.service.bo.DemoOptBO;
import com.liziczh.mvc.mesh.service.convertor.DemoPOConvertor;
import com.liziczh.mvc.mesh.service.repository.DemoRepository;
import com.liziczh.mvc.mesh.service.service.DemoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoRepository demoRepository;

    @Autowired
    private DemoPOConvertor demoBOConvertor;

    @Override
    public BaseResponse<List<DemoBO>> queryPage(DemoQueryReq req) {
        List<DemoBO> boList = demoRepository.selectByCondition(req);
        return ResponseBuilder.success(boList);
    }

    @Override
    public BaseResponse<DemoBO> getDemo(Long demoId) {
        DemoBO bo = demoRepository.get(demoId);
        return ResponseBuilder.success(bo);
    }

    @Override
    public BaseResponse<DemoOptBO> addDemo(DemoCommandReq req) {
        return null;
    }

    @Override
    public BaseResponse<DemoOptBO> updateDemo(DemoCommandReq demo) {
        return null;
    }

    @Override
    public BaseResponse<DemoOptBO> deleteDemo(Long demoId) {
        return null;
    }

    @Override
    public BaseResponse<String> refTest() {
        return null;
    }

}
