package com.trainings.jms_topic.config;

import com.trainings.jms_topic.consumer.MessageSubscriber1;
import com.trainings.jms_topic.consumer.MessageSubscriber2;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

/**
 * @author jlising - 4/13/16.
 */
//http://www.roytuts.com
@Configuration
@ComponentScan(basePackages = {"com.trainings.jms"})
public class JmsTopicConfig {

    //Activemq connection factory
    @Bean
    ActiveMQConnectionFactory amqConnectionFactory(){
        return new ActiveMQConnectionFactory("vm://localhost");
    }

    //ConnectionFactory Definition
    @Bean
    CachingConnectionFactory connectionFactory(){
        return new CachingConnectionFactory(amqConnectionFactory());
    }

    //Destination Topic
    @Bean
    ActiveMQTopic destinationTopic(){
        return new ActiveMQTopic("destinationTopic");
    }

    //JmsTemplate Definition
    @Bean
    JmsTemplate jmsTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestination(destinationTopic());
        template.setPubSubDomain(true);

        return template;
    }

    //Message Subscriber1 Container
    @Bean
    DefaultMessageListenerContainer subscriber1Container(){
        DefaultMessageListenerContainer subscriber1Container = new DefaultMessageListenerContainer();

        subscriber1Container.setConnectionFactory(connectionFactory());
        subscriber1Container.setDestinationName("destinationTopic");
        subscriber1Container.setMessageListener(new MessageSubscriber1());
        subscriber1Container.setPubSubDomain(true);


        return subscriber1Container;
    }

    //Message Subscriber2 Container
    @Bean
    DefaultMessageListenerContainer subscriber2Container(){
        DefaultMessageListenerContainer subscriber2Container = new DefaultMessageListenerContainer();

        subscriber2Container.setConnectionFactory(connectionFactory());
        subscriber2Container.setDestinationName("destinationTopic");
        subscriber2Container.setMessageListener(new MessageSubscriber2());
        subscriber2Container.setPubSubDomain(true);


        return subscriber2Container;
    }
}
