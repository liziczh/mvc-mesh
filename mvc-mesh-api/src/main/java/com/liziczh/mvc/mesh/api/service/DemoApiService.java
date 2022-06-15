package com.liziczh.mvc.mesh.api.service;

import java.util.List;

import com.liziczh.mvc.mesh.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.api.req.DemoCommandReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;

public interface DemoApiService {

    /**
     * 分页条件查询
     *
     * @param req
     * @return java.util.List<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:37 上午
     */
    BaseResponse<List<DemoDTO>> queryPage(DemoQueryReq req) throws Exception;

    /**
     * 查询单个实体信息
     *
     * @param demoId
     * @return com.liziczh.mvc.mesh.api.dto.DemoDTO
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoDTO> getDemo(Long demoId) throws Exception;

    /**
     * 新增实体
     *
     * @param req
     * @return java.lang.Integer
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoOptDTO> addDemo(DemoCommandReq req) throws Exception;

    /**
     * 更新实体
     *
     * @param demo
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<DemoOptDTO> updateDemo(DemoCommandReq demo) throws Exception;

    /**
     * 删除实体
     *
     * @param demoId
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<DemoOptDTO> deleteDemo(Long demoId) throws Exception;

    /**
     * 外部服务调用测试
     *
     * @param
     * @return java.lang.String
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<String> refTest();
}
