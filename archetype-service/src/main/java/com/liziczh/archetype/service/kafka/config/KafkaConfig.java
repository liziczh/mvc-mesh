package com.liziczh.archetype.service.kafka.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class KafkaConfig {
	@Value("${spring.kafka.producer.bootstrap-servers}")
	private String bootstrapServers;
	@Value("${spring.kafka.producer.create-topics:#{null}}")
	private String createTopics;
	@Value("${spring.kafka.producer.partition-num:#{null}}")
	private String partitionNum;
	@Value("${spring.kafka.producer.replication-factor:#{null}}")
	private String replicationFactor;

	@PostConstruct
	private void createTopic() {
		if (StringUtils.isNoneBlank(createTopics, partitionNum, replicationFactor)) {
			List<NewTopic> newTopics = new ArrayList<>();
			for (String topicName : createTopics.split(",")) {
				newTopics.add(new NewTopic(topicName, Integer.parseInt(partitionNum), Short.parseShort(replicationFactor)));
			}
			AdminClient client = AdminClient.create(kafkaAdmin().getConfig());
			client.createTopics(newTopics);
			client.close();
		}
	}
	@Bean
	public KafkaAdmin kafkaAdmin() {
		Map<String, Object> configs = new HashMap<>();
		configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		KafkaAdmin admin = new KafkaAdmin(configs);
		admin.setFatalIfBrokerNotAvailable(true);
		return admin;
	}
}
