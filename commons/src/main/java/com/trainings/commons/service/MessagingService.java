package com.trainings.commons.service;

import org.springframework.messaging.MessagingException;

/**
 * Messaging Service that provides api for event-driven integration
 * of modules and inter-subsystems.
 *
 */
public interface MessagingService {

    void notify(Object payload, String selector);

    void handleException(MessagingException e, String endpoint);

    <T> T request(Object payload, String selector);
}
