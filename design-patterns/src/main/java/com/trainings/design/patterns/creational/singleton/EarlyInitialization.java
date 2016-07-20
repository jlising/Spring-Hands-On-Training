package com.trainings.design.patterns.creational.singleton;

public class EarlyInitialization {
	private static EarlyInitialization INSTANCE = new EarlyInitialization();//Early, instance will be created at load time. Assigned instance to static variable.

	private EarlyInitialization() {}// Private constructor to avoid initialization using new

	public static EarlyInitialization getInstance() { // Static method to return the instance from the static variable
		return INSTANCE;
	}

	public void doSomething() {
		System.out.println("Doing something.");
	}
}
