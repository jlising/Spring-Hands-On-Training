package com.trainings.integration.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class PrinterService {
	// if only one method is present in the class the @ServiceActivator is not
	// necessary
	// in alternative the method has to be explicitly declared in the
	// configuration
	@ServiceActivator(inputChannel="outputChannel")
	public void printValue(String value) {
		System.out.println(value);
	}
}