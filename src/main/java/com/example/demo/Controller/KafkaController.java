package com.example.demo.Controller;


import com.example.demo.DTO.UserDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KafkaController {

    private KafkaTemplate<String, UserDTO> template;
//    private MyTopicConsumer myTopicConsumer;

    public KafkaController(KafkaTemplate<String, UserDTO> template) {
        this.template = template;
//        this.myTopicConsumer = myTopicConsumer;
    }

//    @GetMapping("/kafka/produce")
//    public void produce(@RequestParam String message) {
//        template.send("myTopic", message);
//    }

    @GetMapping("/kafka/produce")
    public void produce() {
        UserDTO message = new UserDTO(1L, 32L, "Jack");
        template.send("myTopic", message);
    }


//    @GetMapping("/kafka/messages")
//    public List<UserDTO> getMessages() {
//        return myTopicConsumer.getMessages();
//    }
}
