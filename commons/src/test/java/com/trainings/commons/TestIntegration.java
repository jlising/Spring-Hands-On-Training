package com.trainings.commons;

import com.trainings.commons.config.CommonIntegrationConfig;
import com.trainings.commons.config.WebMvcConfig;
import com.trainings.commons.service.MessagingService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author jlising - 4/12/16.
 */
@WebAppConfiguration
@ContextConfiguration(classes = {
        WebMvcConfig.class,
        CommonIntegrationConfig.class}, loader = AnnotationConfigWebContextLoader.class)
public class TestIntegration  extends AbstractJUnit4SpringContextTests {

    @Autowired
    private TestGateway testGateway;

    @Autowired
    MessagingService messagingService;

    @Test
    public void testSimpleMessage() {
        testGateway.test("**************************** Test ****************************");
    }

    @Test
    public void testMessagingService(){
        messagingService.notify("**************************** Test ****************************", "testChannel2");
    }
}
