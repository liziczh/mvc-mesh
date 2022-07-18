package com.liziczh.mvc.mesh.service.service.impl;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.api.req.DemoAddReq;
import com.liziczh.mvc.mesh.api.req.DemoInfoReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.api.req.DemoUpdateReq;
import com.liziczh.mvc.mesh.api.service.DemoApiService;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.bo.opt.DemoOptBO;
import com.liziczh.mvc.mesh.service.convertor.DemoApiConvertor;
import com.liziczh.mvc.mesh.service.service.DemoOptService;
import com.liziczh.mvc.mesh.service.service.DemoQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class DemoApiServiceImpl implements DemoApiService {

    @Autowired
    private DemoQueryService demoQueryService;

    @Autowired
    private DemoOptService demoOptService;

    @Autowired
    private DemoApiConvertor demoApiConvertor;

    @Override
    public BaseResponse<List<DemoDTO>> pageQuery(DemoQueryReq req) {
        BaseResponse<List<DemoBO>> response = demoQueryService.pageQuery(req);
        return ResponseBuilder.success(demoApiConvertor.toDTOList(response.getData()));
    }

    @Override
    public BaseResponse<DemoDTO> getDemo(DemoInfoReq req) {
        BaseResponse<DemoBO> response = demoQueryService.getDemo(req);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<DemoOptDTO> addDemo(DemoAddReq req) {
        BaseResponse<DemoOptBO> response = demoOptService.addDemo(req);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<DemoOptDTO> updateDemo(DemoUpdateReq demo) {
        BaseResponse<DemoOptBO> response = demoOptService.updateDemo(demo);
        return ResponseBuilder.success(demoApiConvertor.toDTO(response.getData()));
    }

    @Override
    public BaseResponse<Void> deleteById(Long demoId) {
        return demoOptService.deleteById(demoId);
    }

}
