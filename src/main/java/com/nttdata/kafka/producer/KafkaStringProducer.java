package com.nttdata.kafka.producer;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaStringProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    public KafkaStringProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        log.info("Producing message {}",message);
        this.kafkaTemplate.send("TOPIC-DEMO",message);
    }
}
