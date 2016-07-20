package com.trainings.jms.annotations.consumer;

import com.trainings.jms.annotations.model.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

@Component
public class JmsAnnotationsReceiver {
	private static final Logger LOG = LoggerFactory.getLogger(JmsAnnotationsReceiver.class);
	
	@JmsListener(destination = "testObjectQueue", containerFactory = "theListenerFactory")
	public void receiveMessage(ObjectMessage message){
		try {
			Notification notification = (Notification) message.getObject();
			LOG.info("Received by testObjectQueue : {}", notification.toString());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@JmsListener(destination = "testTextQueue", containerFactory = "theListenerFactory")
	public void receiveMessage(TextMessage message){
		TextMessage textMessage = (TextMessage) message;
		
		LOG.info("Received by JMS testTextQueue : {}", textMessage);
	}

	@JmsListener(destination = "defaultQueue", containerFactory = "theListenerFactory")
	public void receiveMessage(String message){
		String textMessage =  message;

		LOG.info("Received by JMS testTextQueue : {}", textMessage);
	}
}
