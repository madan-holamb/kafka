package com.kafka.test.config;

import org.apache.kafka.common.serialization.Serdes;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.kafka.test.models.DataModel;

public class DataModelSerde extends Serdes.WrapperSerde<DataModel> {
    public DataModelSerde() {
        super(new JsonSerializer<>(), new JsonDeserializer<>(DataModel.class));
    }
}
