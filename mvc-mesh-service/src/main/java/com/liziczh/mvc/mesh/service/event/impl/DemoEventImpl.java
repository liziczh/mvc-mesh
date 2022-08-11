package com.liziczh.mvc.mesh.service.event.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liziczh.mvc.mesh.mq.bo.DemoEventDTO;
import com.liziczh.mvc.mesh.mq.producer.EventSender;
import com.liziczh.mvc.mesh.service.bo.info.DemoBO;
import com.liziczh.mvc.mesh.service.event.DemoEvent;

/**
 * Demo事件发送
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:11 上午
 */
@Service
public class DemoEventImpl implements DemoEvent {

    @Autowired
    private EventSender eventSender;

    @Override
    public void publishEvent(DemoBO demoBO) {
        eventSender.sendMsg(DemoEventDTO.builder().name(demoBO.getName()).build());
    }
}
