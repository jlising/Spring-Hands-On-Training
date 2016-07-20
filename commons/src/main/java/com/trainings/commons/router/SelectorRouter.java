package com.trainings.commons.router;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;
import org.springframework.messaging.handler.annotation.Header;

import static com.trainings.commons.config.CommonIntegrationConfig.INPUT_CHANNEL;
@MessageEndpoint
public class SelectorRouter {

    public final static String SELECTOR = "selector";

    @Router(inputChannel = INPUT_CHANNEL)
    public String route(@Header(SELECTOR) String selector) {
        return selector;
    }

}