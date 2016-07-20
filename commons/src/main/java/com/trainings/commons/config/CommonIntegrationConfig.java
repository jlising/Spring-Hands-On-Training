package com.trainings.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.MessageChannel;

/**
 * @author jlising - 4/12/16.
 */
@ComponentScan(basePackages = {"com.trainings"})
@IntegrationComponentScan(basePackages = {"com.trainings"})
@Configuration
@EnableIntegration
public class CommonIntegrationConfig {
    public static final String APP_ERROR_CHANNEL = "appErrorChannel";
    public static final String INPUT_CHANNEL = "inputChannel";

    /**
     * Synchronous channel used to provide integration between modules within the same process.
     *
     * @return
     */
    @Bean
    public MessageChannel inputChannel() {
        DirectChannel directChannel = new DirectChannel();
        return directChannel;
    }

    @Bean(name = APP_ERROR_CHANNEL)
    public MessageChannel appErrorChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessagingTemplate messagingTemplate(MessageChannel inputChannel) {
        MessagingTemplate messagingTemplate = new MessagingTemplate(inputChannel);
        return messagingTemplate;
    }
}
