package com.liziczh.mvc.mesh.service.service.impl;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.base.common.enums.DeletedEnum;
import com.liziczh.base.common.exception.BizInfoException;
import com.liziczh.mvc.mesh.api.enums.DemoStatusEnum;
import com.liziczh.mvc.mesh.api.enums.ResponseCodeEnum;
import com.liziczh.mvc.mesh.api.req.DemoAddReq;
import com.liziczh.mvc.mesh.api.req.DemoUpdateReq;
import com.liziczh.mvc.mesh.common.enums.IdEnum;
import com.liziczh.mvc.mesh.common.response.ResponseBuilder;
import com.liziczh.mvc.mesh.redis.utils.RedisUtils;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.bo.opt.DemoOptBO;
import com.liziczh.mvc.mesh.service.convertor.DemoInfoConvertor;
import com.liziczh.mvc.mesh.service.repository.DemoQueryRepository;
import com.liziczh.mvc.mesh.service.repository.DemoTxRepository;
import com.liziczh.mvc.mesh.service.service.DemoOptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

/**
 * 操作服务
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
@Slf4j
@Service
public class DemoOptServiceImpl implements DemoOptService {

    @Autowired
    private DemoTxRepository demoTxRepository;

    @Autowired
    private DemoQueryRepository demoQueryRepository;

    @Autowired
    private DemoInfoConvertor demoBOConvertor;

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public BaseResponse<DemoOptBO> addDemo(DemoAddReq req) {

        Long demoId = redisUtils.incr(IdEnum.DEMO.getCode());

        // 初始化BO
        DemoBO bo = new DemoBO();
        bo.setCreateTime(new Date());
        bo.setCreateUser(String.valueOf(req.getUserId()));
        bo.setUpdateTime(new Date());
        bo.setUpdateUser(String.valueOf(req.getUserId()));
        bo.setDeleted(DeletedEnum.NORMAL.getCode());
        bo.setDemoId(demoId);
        bo.setUserId(req.getUserId());
        bo.setStatus(DemoStatusEnum.INIT.getCode());
        bo.setName(req.getName());
        bo.setDesc(req.getDesc());

        // 新增
        demoTxRepository.insert(bo);

        return ResponseBuilder.success(DemoOptBO.builder().demoId(bo.getDemoId()).build());
    }

    @Override
    public BaseResponse<DemoOptBO> updateDemo(DemoUpdateReq req) {

        // 查询
        DemoBO bo = demoQueryRepository.getByDemoId(req.getDemoId(), req.getUserId());
        if (Objects.isNull(bo)) {
            throw new BizInfoException(ResponseCodeEnum.INVALID_BO.getCode(), ResponseCodeEnum.INVALID_BO.getDesc());
        }

        // 更新BO
        bo.setUpdateTime(new Date());
        bo.setUpdateUser(String.valueOf(req.getUserId()));
        bo.setStatus(DemoStatusEnum.VALID.getCode());
        bo.setName(req.getName());
        bo.setDesc(req.getDesc());

        // 更新
        demoTxRepository.update(bo);

        return ResponseBuilder.success(DemoOptBO.builder().demoId(bo.getDemoId()).build());
    }

    @Override
    public BaseResponse<Void> deleteById(Long id) {
        demoTxRepository.deleteById(id);
        return ResponseBuilder.success();
    }

}
