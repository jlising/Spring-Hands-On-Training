package com.trainings.jms.annotations.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.trainings.jms.annotations"})
public class JmsAnnotationsConfig {
    @Bean
    ActiveMQQueue testObjectQueue(){
        return new ActiveMQQueue("testObjectQueue");
    }

    @Bean
    ActiveMQQueue testTextQueue(){
        return new ActiveMQQueue("testTextQueue");
    }
}

