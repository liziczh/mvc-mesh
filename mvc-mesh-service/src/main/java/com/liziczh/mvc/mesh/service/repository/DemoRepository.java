package com.liziczh.mvc.mesh.service.repository;

import java.util.List;

import com.liziczh.mvc.mesh.api.req.DemoQueryReq;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;

/**
 * 资源层接口
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 0:20
 */
public interface DemoRepository {

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
    DemoBO get(Long id);

    /**
     * 新增
     *
     * @author chenzhehao
     * @date 2021/7/18 0:35
     */
    void insert(DemoBO bo);

    /**
     * 更新
     *
     * @author chenzhehao
     * @date 2021/7/18 0:36
     */
    void update(DemoBO bo);

    /**
     * ID删除
     *
     * @author chenzhehao
     * @date 2021/7/18 0:37
     */
    void deleteByDemoId(Long demoId);

}
