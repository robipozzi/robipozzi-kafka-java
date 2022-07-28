package com.rpozzi.kafka.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import com.rpozzi.kafka.KafkaApplication;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageListener {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaApplication.class);
	
    @KafkaListener(topics = "${kafka.message.topic.name}", groupId = "${kafka.message.groupId")
    public void listenMessage(String message) {
        log.info("Received Message: " + message);
    }
}