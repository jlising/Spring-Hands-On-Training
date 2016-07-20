package com.trainings.commons.router;

import com.trainings.commons.service.MessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.handler.ReplyRequiredException;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandlingException;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;

import static com.trainings.commons.config.CommonIntegrationConfig.APP_ERROR_CHANNEL;

/**
 * @author vrustia - 12/3/15.
 */
@MessageEndpoint
public class AppErrorEndpoint {

    private final static Logger LOG = LoggerFactory.getLogger(AppErrorEndpoint.class);

    private static final Message<Object> NULL_MESSAGE = createNullMessage();

    @Autowired
    private MessagingService messagingService;

    private static Message<Object> createNullMessage() {
        return new Message<Object>() {
            public Object getPayload() {
                return null;
            }
            public MessageHeaders getHeaders() {
                return null;
            }
        };
    }

    @ServiceActivator(inputChannel = APP_ERROR_CHANNEL)
    public Message<?> errorHandler(Message<MessageHandlingException> message) {
        MessageHandlingException messageHandlingException = message.getPayload();
        handleMessagingException(messageHandlingException);
        return NULL_MESSAGE;
    }

    private void handleMessagingException(MessagingException messageHandlingException) {
        messagingService.handleException(messageHandlingException, APP_ERROR_CHANNEL);
    }


    @Transformer(inputChannel = APP_ERROR_CHANNEL)
    public Message<?> transformNull(Message<Object> message) {
        Object payload = message.getPayload();

        if (payload instanceof ReplyRequiredException) {
            return NULL_MESSAGE;
        }

        if (payload instanceof MessagingException) {
            handleMessagingException((MessagingException) payload);
        }

        return message;
    }

}
