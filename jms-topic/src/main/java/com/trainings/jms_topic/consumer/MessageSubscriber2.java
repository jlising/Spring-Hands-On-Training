package com.trainings.jms_topic.consumer;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class MessageSubscriber2 implements MessageListener {
	 
	  public void onMessage(Message message) {
	    if (message instanceof TextMessage) {
	      try {
	        String msg = ((TextMessage) message).getText();
	        System.out.println("Message consumed by MessageSubscriber2 : " + msg);
	      } catch (JMSException ex) {
	        throw new RuntimeException(ex);
	      }
	    } else {
	      throw new IllegalArgumentException("Message must be of type TextMessage");
	    }
	  }
	 
}