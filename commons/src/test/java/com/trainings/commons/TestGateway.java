package com.trainings.commons;

import org.springframework.integration.annotation.MessagingGateway;

/**
 * @author jlising - 4/12/16.
 */
@MessagingGateway
public interface TestGateway {

    @org.springframework.integration.annotation.Gateway(requestChannel = "testChannel")
    String test(String str);
}
