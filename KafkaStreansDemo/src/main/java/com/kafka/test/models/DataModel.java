package com.kafka.test.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DataModel {

	String transactionId;
	String make;
	String model;
	String year;
	String saleTimestamp;
	String dealerId;
	String dealerName;
	String state;
	String price;
}
