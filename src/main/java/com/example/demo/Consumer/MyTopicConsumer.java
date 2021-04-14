package com.example.demo.Consumer;


import com.example.demo.DTO.UserDTO;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
//public class MyTopicConsumer {
//
//    private final List<UserDTO> messages = new ArrayList<>();
//
//    @KafkaListener(topics = "myTopic", groupId = "kafka-sandbox")
//    public void listen(UserDTO message) {
//        synchronized (messages) {
//            messages.add(message);
//        }
//    }
//
//    public List<UserDTO> getMessages() {
//        return messages;
//    }
//}
