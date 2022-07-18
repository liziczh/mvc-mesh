package com.liziczh.mvc.mesh.service.service.impl;
import java.util.Date;

import java.util.List;

import cn.hutool.core.lang.generator.SnowflakeGenerator;
import com.liziczh.base.common.enums.DeletedEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.req.DemoCommandReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.bo.opt.DemoOptBO;
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

        DemoBO bo = new DemoBO();
        bo.setCreateTime(new Date());
        bo.setCreateUser("");
        bo.setUpdateTime(new Date());
        bo.setUpdateUser("");
        bo.setDeleted(DeletedEnum.NORMAL.getCode());
        bo.setDemoId(10001L);
        bo.setUserId(10001L);
        bo.setStatus(1);
        bo.setName(req.getName());
        bo.setDesc(req.getDesc());


        demoRepository.insert(bo);

        return ResponseBuilder.success();
    }

    @Override
    public BaseResponse<DemoOptBO> updateDemo(DemoCommandReq demo) {
        DemoBO bo = new DemoBO();
        bo.setCreateTime(new Date());
        bo.setCreateUser("");
        bo.setUpdateTime(new Date());
        bo.setUpdateUser("");
        bo.setDeleted(DeletedEnum.NORMAL.getCode());
        bo.setDemoId(10001L);
        bo.setUserId(10001L);
        bo.setName("chenzhehao");
        bo.setStatus(1);

        demoRepository.update(bo);

        return ResponseBuilder.success();
    }

    @Override
    public BaseResponse<DemoOptBO> deleteDemo(Long demoId) {
        demoRepository.deleteByDemoId(demoId);
        return null;
    }

    @Override
    public BaseResponse<String> refTest() {
        return null;
    }

}
