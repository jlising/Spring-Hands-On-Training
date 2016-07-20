package com.trainings.jms.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author jlising - 4/13/16.
 */
@MessageEndpoint
public class TestEndpoint {
    private final static Logger LOG = LoggerFactory.getLogger(TestEndpoint.class);

    @ServiceActivator(inputChannel = "noReturnTestChannel")
    public void noReturnTestChannel(String str){
        LOG.info("Received message[{}] in {}", str, this.getClass().getSimpleName());
    }
}
