package com.trainings.commons.service.impl;

import com.trainings.commons.config.CommonIntegrationConfig;
import com.trainings.commons.router.SelectorRouter;
import com.trainings.commons.service.MessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.integration.handler.ReplyRequiredException;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import static org.springframework.integration.support.MessageBuilder.withPayload;

@Component
public class MessagingServiceImpl implements MessagingService {

    private final static Logger LOG = LoggerFactory.getLogger(MessagingServiceImpl.class);

    @Autowired
    private MessageChannel inputChannel;

    @Autowired
    private MessagingTemplate messagingTemplate;

    public void notify(Object payload, String selector) {
        try {
            inputChannel.send(withPayload(payload)
                    .setHeader(SelectorRouter.SELECTOR, selector)
                    .setHeader(MessageHeaders.ERROR_CHANNEL, CommonIntegrationConfig.APP_ERROR_CHANNEL)
                    .build());
        } catch (MessagingException e) {
            handleException(e, selector);
        }
    }

    public void handleException(MessagingException e, String endpoint) {
        Throwable rootCause = e.getCause();
        LOG.error("Exception received after sending to endpoint={} ", endpoint, rootCause);
        if (rootCause instanceof RuntimeException)
            throw (RuntimeException) rootCause;
        else throw new RuntimeException(e);
    }


    public <T> T request(Object payload, String selector) {
        try {
            Message message = messagingTemplate.sendAndReceive(withPayload(payload)
                    .setHeader(MessageHeaders.ERROR_CHANNEL,  CommonIntegrationConfig.APP_ERROR_CHANNEL)
                    .setHeader(SelectorRouter.SELECTOR, selector)
                    .build());
            Object response = message.getPayload();
            return (T) response;
        } catch (MessagingException e) {
            if (e instanceof ReplyRequiredException) {
                return null;
            }
            handleException(e, selector);
        }

        return null;

    }
}
