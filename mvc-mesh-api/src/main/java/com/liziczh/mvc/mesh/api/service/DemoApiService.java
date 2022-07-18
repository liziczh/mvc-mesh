package com.liziczh.mvc.mesh.api.service;

import com.liziczh.base.api.common.response.BaseResponse;
import com.liziczh.mvc.mesh.api.dto.DemoDTO;
import com.liziczh.mvc.mesh.api.dto.DemoOptDTO;
import com.liziczh.mvc.mesh.api.req.DemoAddReq;
import com.liziczh.mvc.mesh.api.req.DemoInfoReq;
import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.api.req.DemoUpdateReq;

import java.util.List;

public interface DemoApiService {

    /**
     * 分页条件查询
     *
     * @param req
     * @return java.util.List<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:37 上午
     */
    BaseResponse<List<DemoDTO>> pageQuery(DemoQueryReq req) throws Exception;

    /**
     * 查询单个实体信息
     *
     * @param req
     * @return com.liziczh.mvc.mesh.api.dto.DemoDTO
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoDTO> getDemo(DemoInfoReq req) throws Exception;

    /**
     * 新增实体
     *
     * @param req
     * @return java.lang.Integer
     * @author chenzhehao
     * @date 2022/1/17 12:41 上午
     */
    BaseResponse<DemoOptDTO> addDemo(DemoAddReq req) throws Exception;

    /**
     * 更新实体
     *
     * @param demo
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<DemoOptDTO> updateDemo(DemoUpdateReq demo) throws Exception;

    /**
     * 删除实体
     *
     * @param id
     * @return com.liziczh.mvc.mesh.api.common.response.BaseResponse<com.liziczh.mvc.mesh.api.dto.DemoDTO>
     * @author chenzhehao
     * @date 2022/1/17 12:53 上午
     */
    BaseResponse<Void> deleteById(Long id) throws Exception;

}
