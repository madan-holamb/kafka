package com.kafka.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.kafka.enduser.constants.AppConstants;

@Configuration
public class KafkaConfig {

	
	@KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
	public void updatedLocation(String location) {
	
			System.out.println(location);
			
	}
	
}
