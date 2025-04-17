//package com.example.SpringKafka.controller;
//
//import com.example.SpringKafka.producer.KafkaProducer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/api")
//public class KafkaController {
//
//    @Autowired
//    private KafkaProducer kafkaProducer;
//
//    @PostMapping("/send/{message}")
//    public ResponseEntity<?>sendMessageToProducer(@PathVariable String message){
//        try{
//            kafkaProducer.sendToTopic1(message);
//            return ResponseEntity.ok("message sent");
//        }
//        catch(Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
//        }
//    }
//
//
//    // send message to special partition of kafka ======================================
//
//
////    @PostMapping("/send/{partition}/{message}")
////    public ResponseEntity<?>sendMessageToProducer(@PathVariable int partition,@PathVariable String message){
////        try{
////            kafkaProducer.sendToTopic1(partition,message);
////            return ResponseEntity.ok("message sent");
////        }
////        catch(Exception e){
////            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
////        }
////    }
//
//
//}




package com.example.SpringKafka.controller;

import com.example.SpringKafka.model.User;
import com.example.SpringKafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/send")
    public ResponseEntity<?>sendMessageToProducer(@RequestBody User user){
        try{
            kafkaProducer.sendToTopic1(user);
            return ResponseEntity.ok("message sent");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    // send message to special partition of kafka ======================================


//    @PostMapping("/send/{partition}/{message}")
//    public ResponseEntity<?>sendMessageToProducer(@PathVariable int partition,@PathVariable String message){
//        try{
//            kafkaProducer.sendToTopic1(partition,message);
//            return ResponseEntity.ok("message sent");
//        }
//        catch(Exception e){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
//        }
//    }


}
