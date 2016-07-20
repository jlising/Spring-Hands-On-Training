package com.trainings.commons.config;

import com.trainings.commons.consumer.JmsConsumer;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.jms.pool.PooledConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.jms.ConnectionFactory;

/**
 * @author jlising - 4/13/16.
 */
@EnableJms
@Configuration
@ComponentScan(basePackages = {"com.trainings"})
public class CommonJmsConfig {
    @Bean
    ActiveMQConnectionFactory amqConnectionFactory(){
        return new ActiveMQConnectionFactory("vm://localhost");
    }

    //Pooled Connection
    PooledConnectionFactory connectionFactory(){
        PooledConnectionFactory factory = new PooledConnectionFactory();
        factory.setConnectionFactory(amqConnectionFactory());

        return factory;
    }

    //Default destination
    @Bean
    ActiveMQQueue defaultQueue(){
        return new ActiveMQQueue("defaultQueue");
    }

    //JMS Template
    @Bean
    JmsTemplate jmsTemplate(){
        JmsTemplate template = new JmsTemplate();
        template.setConnectionFactory(connectionFactory());
        template.setDefaultDestination(defaultQueue());

        return template;
    }

    //Message Listener
    @Bean
    DefaultMessageListenerContainer messageListenerContainer(){
        DefaultMessageListenerContainer messageListenerContainer = new DefaultMessageListenerContainer();
        messageListenerContainer.setConnectionFactory(connectionFactory());
        messageListenerContainer.setDestination(defaultQueue());

        messageListenerContainer.setConcurrentConsumers(10);
        messageListenerContainer.setConcurrency("10-50");

        messageListenerContainer.setMessageListener(new JmsConsumer());

        //messageListenerContainer.setMessageSelector("JMSType = 'New'");
        return messageListenerContainer;
    }

    //Message Listener connection factory (use this in annotations)
    @Bean
    JmsListenerContainerFactory<?> theListenerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConcurrency("10-50");

        factory.setConnectionFactory(connectionFactory);

        return factory;
    }
}
