package com.liziczh.mvc.mesh.service.ref;

import com.liziczh.mvc.mesh.service.bo.DemoBO;
import com.liziczh.mvc.mesh.service.bo.DemoExternalBO;

/**
 * 外部服务调用
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 1:47
 */
public interface DemoRemoteService {

    /**
     * 调用外部服务接口
     *
     * @author chenzhehao
     * @date 2021/7/18 1:50
     */
    DemoExternalBO callRemoteService(DemoBO demoBO);

}
