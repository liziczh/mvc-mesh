package com.liziczh.archetype.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

	@KafkaListener(topics = {"archetypeTopic"})
	public void MessageProcesser(String msg){
		System.out.println(msg);
	}
}
