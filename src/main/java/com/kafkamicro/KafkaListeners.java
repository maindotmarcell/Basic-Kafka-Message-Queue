package com.kafkamicro;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "kafka_micro", groupId = "groupID")
    void listener(String data) {
        System.out.println("Listener received: " + data + " 🎉");
    }

}
