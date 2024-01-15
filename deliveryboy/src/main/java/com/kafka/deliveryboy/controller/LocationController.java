package com.kafka.deliveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.deliveryboy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updatingLocation(){
		for(int i=0;i<=99999;i++) {
			this.kafkaService.updateLocation("("+ Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")");
		}
		
		
		return new ResponseEntity<>(Map.of("Message","Location Updated"),HttpStatus.OK);
	}
	

}
