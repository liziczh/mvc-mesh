package com.liziczh.mvc.mesh.service.service.impl;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.req.DemoInfoReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.repository.DemoQueryRepository;
import com.liziczh.mvc.mesh.service.service.DemoQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 查询服务
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
@Slf4j
@Service
public class DemoQueryServiceImpl implements DemoQueryService {

    @Autowired
    private DemoQueryRepository demoQueryRepository;

    @Override
    public BaseResponse<List<DemoBO>> pageQuery(DemoQueryReq req) {
        List<DemoBO> boList = demoQueryRepository.selectByCondition(req);
        return ResponseBuilder.success(boList);
    }

    @Override
    public BaseResponse<DemoBO> getById(Long demoId) {
        DemoBO bo = demoQueryRepository.getById(demoId);
        return ResponseBuilder.success(bo);
    }

    @Override
    public BaseResponse<DemoBO> getDemo(DemoInfoReq req) {
        DemoBO bo = demoQueryRepository.getByDemoId(req.getDemoId(), req.getUserId());
        return ResponseBuilder.success(bo);
    }

}
