package com.liziczh.mvc.mesh.service.ref.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.mvc.mesh.ref.demo.DemoRefService;
import com.liziczh.mvc.mesh.ref.demo.dto.DemoRefDTO;
import com.liziczh.mvc.mesh.ref.demo.req.DemoRefReq;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.bo.ref.DemoRefBO;
import com.liziczh.mvc.mesh.service.ref.DemoRemoteService;

import lombok.extern.slf4j.Slf4j;

/**
 * common
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/6/15 10:09 下午
 */
@Slf4j
@Service
public class DemoRemoteServiceImpl implements DemoRemoteService {

    @Autowired
    private DemoRefService demoRefService;

    @Override
    public DemoRefBO callRemoteService(DemoBO demoBO) {
        DemoRefDTO demoRefDTO = demoRefService.remoteCall(DemoRefReq.builder().name(demoBO.getName()).build());
        return DemoRefBO.builder().result(demoRefDTO.getResult()).build();
    }

}
