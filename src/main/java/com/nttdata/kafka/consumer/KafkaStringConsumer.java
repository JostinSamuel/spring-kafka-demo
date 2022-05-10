package com.nttdata.kafka.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaStringConsumer {

    @KafkaListener(topics = "TOPIC-DEMO", groupId = "group_id")
    public void consume(String message){
        log.info("Consuming message {} ", message);
    }

}
