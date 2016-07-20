package com.trainings.integration.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class TransformService {
	@ServiceActivator(inputChannel = "transformChannel", outputChannel = "outputChannel")
	public String transformValue(String value) {
		return value + " Welcome!";
	}
}
