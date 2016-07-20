package com.trainings.jms_topic;

import com.trainings.commons.config.WebMvcConfig;
import com.trainings.jms_topic.config.JmsTopicConfig;
import com.trainings.jms_topic.producer.MessagePublisher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author jlising - 4/8/16.
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebMvcConfig.class, JmsTopicConfig.class})
public class TestJmsTopic {

    @Autowired
    MessagePublisher messagePublisher;

    @Test
    public void testJmsTopic(){
        messagePublisher.sendMessage("**************** TEST ******************");
    }
}
