package com.liziczh.mvc.mesh.service.service;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.req.DemoAddReq;
import com.liziczh.mvc.mesh.api.req.DemoUpdateReq;
import com.liziczh.mvc.mesh.service.bo.opt.DemoOptBO;

/**
 * 操作服务
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:26
 */
public interface DemoOptService {

    /**
     * 新增实体
     *
     * @param req
     * @return java.lang.Integer
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoOptBO> addDemo(DemoAddReq req);

    /**
     * 更新实体
     *
     * @param req
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoBO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<DemoOptBO> updateDemo(DemoUpdateReq req);

    /**
     * 删除实体
     *
     * @param id
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoBO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<Void> deleteById(Long id);
}
