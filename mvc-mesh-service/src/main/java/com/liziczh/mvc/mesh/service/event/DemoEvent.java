package com.liziczh.mvc.mesh.service.event;

import com.liziczh.mvc.mesh.service.bo.DemoEventBO;

/**
 * 事件
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2021/7/18 1:45
 */
public interface DemoEvent {

    /**
     * 发布事件
     *
     * @author chenzhehao
     * @date 2021/7/18 1:46
     */
    void publishEvent(DemoEventBO eventBO);

}
