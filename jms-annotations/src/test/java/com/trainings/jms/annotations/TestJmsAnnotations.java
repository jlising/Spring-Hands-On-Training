package com.trainings.jms.annotations;

import com.trainings.commons.config.CommonIntegrationConfig;
import com.trainings.commons.config.CommonJmsConfig;
import com.trainings.commons.config.WebMvcConfig;
import com.trainings.commons.service.MessagingService;
import com.trainings.jms.annotations.config.JmsAnnotationsConfig;
import com.trainings.jms.annotations.model.Notification;
import com.trainings.jms.annotations.producer.JmsAnnotationsSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.jms.Destination;

/**
 * @author jlising - 4/8/16.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class, CommonJmsConfig.class, CommonIntegrationConfig.class, JmsAnnotationsConfig.class, TestEndpoint.class})
public class TestJmsAnnotations {

    @Autowired
    JmsAnnotationsSender jmsAnnotationsSender;

    @Autowired
    MessagingService messagingService;

    @Autowired
    Destination testTextQueue;

    @Test
    public void testJms(){
        Notification notification = new Notification("1", "********************* Test Notification Object *************************");
        //jmsAnnotationsSender.send("Hello from JMS Annotations");
        jmsAnnotationsSender.sendNotification(notification);
    }

    @Test
    public void testMessagingService(){
        messagingService.notify("********************* Test Simple Text *************************","noReturnTestChannel");
    }

    @Test
    public void testQueue(){
        jmsAnnotationsSender.send(testTextQueue, "********************* Test *************************");
    }
}
