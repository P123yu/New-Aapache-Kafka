package com.example.SpringKafka.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    @Bean
    NewTopic myTopic1(){
        return TopicBuilder.name("firstTopic12").partitions(4).replicas(1).build();
    }

}
