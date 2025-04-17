//package com.example.SpringKafka.consumer;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.annotation.TopicPartition;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.stereotype.Component;
//import org.springframework.kafka.support.KafkaHeaders;
//
//@Component
//public class KafkaConsumer {
//
//    // send message without specific partition ===================================
//
////    @KafkaListener(topics = "firstKafkaTopic", groupId = "group1")
////    public void consume(String message) {
////        System.out.println(" Received: " + message);
////    }
//
//
//    @KafkaListener(topics = "firstTopic", groupId = "group1")
//    public void consume(String message) {
//        System.out.println(" Received: " + message);
//    }
//
//
//    // send message to specific partition ===================================
//
//    // send message to partition 0 ============================
//
////    @KafkaListener(
////            topicPartitions = @TopicPartition(topic = "kafkaTopic1", partitions = {"0"}),
////            groupId = "group1"
////    )
////    public void consumePartition1(String message) {
////        System.out.println("Received Partition1: " + message);
////    }
//
//
//    // send message to partition 1 ============================
//
//
////    @KafkaListener(
////            topicPartitions = @TopicPartition(topic = "kafkaTopic1", partitions = {"1"}),
////            groupId = "group1"
////    )
////    public void consumePartition2(String message) {
////        System.out.println("Received Partition2: " + message);
////    }
//
//
//
//}
//
//
//
//
//
//
//
//
//// extra ==========================================================
//
//
////    @KafkaListener(topics = "kafkaTopic1", groupId = "group1")
////    public void consume(String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
////        System.out.println("📥 Received: '" + message + "' from partition: " + partition);
////    }
//




package com.example.SpringKafka.consumer;
import com.example.SpringKafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;
import org.springframework.kafka.support.KafkaHeaders;

@Component
public class KafkaConsumer {

    // send message without specific partition ===================================

//    @KafkaListener(topics = "firstKafkaTopic", groupId = "group1")
//    public void consume(String message) {
//        System.out.println(" Received: " + message);
//    }


    @KafkaListener(topics = "firstTopic12", groupId = "group1")
    public void consume(User user) {
        System.out.println(" Received: " + user);
    }


    // send message to specific partition ===================================

    // send message to partition 0 ============================

//    @KafkaListener(
//            topicPartitions = @TopicPartition(topic = "kafkaTopic1", partitions = {"0"}),
//            groupId = "group1"
//    )
//    public void consumePartition1(String message) {
//        System.out.println("Received Partition1: " + message);
//    }


    // send message to partition 1 ============================


//    @KafkaListener(
//            topicPartitions = @TopicPartition(topic = "kafkaTopic1", partitions = {"1"}),
//            groupId = "group1"
//    )
//    public void consumePartition2(String message) {
//        System.out.println("Received Partition2: " + message);
//    }



}








// extra ==========================================================


//    @KafkaListener(topics = "kafkaTopic1", groupId = "group1")
//    public void consume(String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
//        System.out.println("📥 Received: '" + message + "' from partition: " + partition);
//    }

