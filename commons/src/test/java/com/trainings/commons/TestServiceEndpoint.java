package com.trainings.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author jlising - 4/12/16.
 */
@MessageEndpoint
public class TestServiceEndpoint {

    private final static Logger LOG = LoggerFactory.getLogger(TestServiceEndpoint.class);

    @ServiceActivator(inputChannel = "testChannel")
    public String testSimpleMessage(String str){

        LOG.info("Received message[{}] in {}", str, this.getClass().getSimpleName());

        return str;
    }

    @ServiceActivator(inputChannel = "testChannel2", requiresReply = "false")
    public void testNoReturnSimpleMessage(String str){

        LOG.info("Received message[{}] in {}", str, this.getClass().getSimpleName());
    }
}
