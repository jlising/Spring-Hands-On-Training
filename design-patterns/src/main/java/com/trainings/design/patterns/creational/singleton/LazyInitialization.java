package com.trainings.design.patterns.creational.singleton;

public class LazyInitialization {
	public static LazyInitialization INSTANCE;

	private LazyInitialization() {}

	public static LazyInitialization getInstance() {
		if (INSTANCE == null) {
			synchronized (LazyInitialization.class) { //we create the instance of the class in synchronized method or synchronized block, so instance of the class is created when required
				if (INSTANCE == null) {
					INSTANCE = new LazyInitialization();// instance will be created at request time
				}
			}
		}

		return INSTANCE;
	}

	public void doSomething() {
		System.out.println("Doing something.");
	}
}
