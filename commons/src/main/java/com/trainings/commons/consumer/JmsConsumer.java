package com.trainings.commons.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author jlising - 4/13/16.
 */
@Component
public class JmsConsumer implements MessageListener {
    private static final Logger LOG = LoggerFactory.getLogger(JmsConsumer.class);

    public void onMessage(Message receivedMessage) {
        TextMessage textMessage =(TextMessage) receivedMessage;

        LOG.info("Received by JMS : {}", textMessage);try{

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}