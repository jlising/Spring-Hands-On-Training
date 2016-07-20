package com.trainings.integration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

//http://xpadro.blogspot.com/2014/05/spring-integration-40-complete-xml-free.html
@Configuration
@ComponentScan(basePackages = { "com.trainings.integration" })
@IntegrationComponentScan("com.trainings.integration")
public class IntegrationConfig {

    @Bean
    MessageChannel inputChannel(){
        return new DirectChannel();
    }

    @Bean
    MessageChannel transformChannel(){
        return new DirectChannel();
    }

    @Bean
    MessageChannel outputChannel(){
        return new DirectChannel();
    }

}
