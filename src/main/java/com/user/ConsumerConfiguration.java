package com.user;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class ConsumerConfiguration {
	
	@KafkaListener(topics=AppConstrant.Location_topic,groupId=AppConstrant.Group_id)
	public void updateLocatinConsumer(String value)
	{
	System.out.println(value);
	}

}
