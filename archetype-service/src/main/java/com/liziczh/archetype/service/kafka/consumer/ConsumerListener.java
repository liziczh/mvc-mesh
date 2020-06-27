package com.liziczh.archetype.service.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {
	@KafkaListener(topics = { "testTopic" })
	public void MessageProcesser(String msg) {
		System.out.println(msg);
	}
}
