package com.trainings.jms.annotations.producer;

import com.trainings.jms.annotations.model.Notification;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class JmsAnnotationsSender {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	ActiveMQQueue defaultQueue;
	
	  /**
	   * send text to default destination
	   * @param text
	   */
	  public void send(final String text) {
	    jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				Message message = session.createTextMessage(text);    
		        //set ReplyTo header of Message, pretty much like the concept of email.
		        message.setJMSReplyTo(defaultQueue);
		        
		        return message;
			}
	    });
	  }
	    
	  /**
	   * Simplify the send by using convertAndSend
	   * @param text
	   */
	  public void sendText(final String text) {
	     jmsTemplate.convertAndSend(text);
	  }
	    
	  /**
	   * Send text message to a specified destination
	   * @param text
	   */
	  public void send(final Destination dest,final String text) {
	    jmsTemplate.send(dest,new MessageCreator() {
	      public Message createMessage(Session session) throws JMSException {
	        Message message = session.createTextMessage(text);
	        return message;
	      }
	    });
	  }
	  
	  public void sendNotification(final Notification notification){
		  MessageCreator messageCreator = new MessageCreator() {
              public Message createMessage(Session session) throws JMSException {
                  ObjectMessage objectMessage = session.createObjectMessage();
                 
                  objectMessage.setObject(notification);
                  return objectMessage;
              }
          };

		  jmsTemplate.send("testObjectQueue", messageCreator);
	  }
}
