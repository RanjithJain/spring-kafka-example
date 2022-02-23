package com.example.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics="exampleTopic", groupId="groupId")
    void listener(String data){
        System.out.println("Kafka Messages --> "+ data);
    }
}
