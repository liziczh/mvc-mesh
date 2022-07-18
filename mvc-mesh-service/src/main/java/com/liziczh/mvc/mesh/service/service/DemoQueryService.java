package com.liziczh.mvc.mesh.service.service;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.req.DemoInfoReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;

import java.util.List;

/**
 * 查询服务
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
public interface DemoQueryService {

    /**
     * 分页条件查询
     *
     * @param req
     * @return java.util.List<com.liziczh.mvc.mesh.api.dto.DemoBO>
     * @author chenzhehao
     * @date 2022/1/17 12:37 上午
     */
    BaseResponse<List<DemoBO>> pageQuery(DemoQueryReq req);

    /**
     * 查询单个实体信息
     *
     * @param id
     * @return com.liziczh.mvc.mesh.api.dto.DemoBO
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoBO> getById(Long id);

    /**
     * 查询单个实体信息
     *
     * @param req
     * @return com.liziczh.mvc.mesh.api.dto.DemoBO
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoBO> getDemo(DemoInfoReq req);

}
