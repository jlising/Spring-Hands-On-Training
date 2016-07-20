package com.trainings.integration.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class HelloService {
	@ServiceActivator(inputChannel ="inputChannel", outputChannel="transformChannel")
	public String sayHello(String name) {
		return "Hello " + name + "!";
	}
}