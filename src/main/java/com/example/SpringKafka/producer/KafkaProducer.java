package com.example.SpringKafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    // send general message in kafka  ==================================

    public void sendToTopic1(String message){
        kafkaTemplate.send("firstKafkaTopic", message);
    }


    // force kafka to change partition to see its working =======================

//    public void sendToTopic1(String message){
//        kafkaTemplate.send("firstKafkaTopic", message)
//                .thenAccept(result -> {
//                    System.out.println("Sent '" + message + "' to partition: " + result.getRecordMetadata().partition());
//                });
//    }

//    public void sendToTopic1(String message) {
//        for (int i = 1; i <= 10000000; i++) {
//            String msg = "Message " + i;
//            kafkaTemplate.send("firstKafkaTopic", message).thenAccept(result -> {
//                System.out.println("Sent '" + msg + "' to partition: " + result.getRecordMetadata().partition());
//            });
//        }
//    }


    // send message to specific partition =====================================


//    public void sendToTopic1(int partition, String message) {
//        kafkaTemplate.send("kafkaTopic1", partition, null, message);
//    }

}



// extra ======================================================






//    public void sendToTopic1(String message) {
//        CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send("kafkaTopic1", message);
//
//        future.thenAccept(result -> {
//            int partition = result.getRecordMetadata().partition();
//            System.out.println(" Sent message: '" + message + "' to partition: " + partition);
//        });
//
//        future.exceptionally(ex -> {
//            System.err.println(" Failed to send message: " + message);
//            ex.printStackTrace();
//            return null;
//        });
//    }

//
//    public void sendToTopic1(String message) {
//        String randomKey = UUID.randomUUID().toString();
//        kafkaTemplate.send("kafkaTopic1", randomKey, message)
//                .thenAccept(result -> {
//                    int partition = result.getRecordMetadata().partition();
//                    System.out.println(" Sent message: '" + message + "' to partition: " + partition);
//                })
//                .exceptionally(ex -> {
//                    ex.printStackTrace();
//                    return null;
//                });
//    }

