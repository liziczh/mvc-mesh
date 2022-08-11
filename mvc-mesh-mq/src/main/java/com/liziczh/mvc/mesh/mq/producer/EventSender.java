package com.liziczh.mvc.mesh.mq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.liziczh.base.common.util.JsonUtils;
import com.liziczh.mvc.mesh.mq.bo.DemoEventDTO;

import lombok.extern.slf4j.Slf4j;

/**
 * Kafka发送示例
 *
 * @author chenzhehao
 * @version 1.0
 * @description
 * @date 2022/1/16 12:11 上午
 */
@Slf4j
@Component
public class EventSender {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    /**
     * 发送消息
     *
     * @param eventDTO
     * @return void
     * @author chenzhehao
     * @date 2022/1/16 7:00 下午
     */
    public void sendMsg(DemoEventDTO eventDTO) {
        kafkaTemplate.send("archetype", JsonUtils.toJson(eventDTO));
    }
}
