package com.liziczh.mvc.mesh.service.repository;

import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;

import java.util.List;

/**
 * 资源层接口
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:20
 */
public interface DemoQueryRepository {

    /**
     * 条件查询
     *
     * @author chenzhehao
     * @date 2021/7/18 0:38
     */
    List<DemoBO> selectByCondition(DemoQueryReq condition);

    /**
     * ID查询
     *
     * @author chenzhehao
     * @date 2021/7/18 0:38
     */
    DemoBO getById(Long id);

    /**
     * DemoID查询
     *
     * @author chenzhehao
     * @date 2021/7/18 0:38
     */
    DemoBO getByDemoId(Long demoId, Long userId);

}
