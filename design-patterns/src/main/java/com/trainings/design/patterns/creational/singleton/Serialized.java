package com.trainings.design.patterns.creational.singleton;

import java.io.Serializable;

public class Serialized implements Serializable{
	private static Serialized INSTANCE = new Serialized();//Early, instance will be created at load time. Assigned instance to static variable.

	private Serialized() {}// Private constructor to avoid initialization using new

	public static Serialized getInstance() { // Static method to return the instance from the static variable
		return INSTANCE;
	}

	public void doSomething() {
		System.out.println("Doing something.");
	}
	
	//If singleton class is Serializable, you can serialize the singleton instance. Once it is serialized, you can deserialize it but it will not return the singleton object.
	protected Object readReadResolve(){
		return getInstance();
	}
}
