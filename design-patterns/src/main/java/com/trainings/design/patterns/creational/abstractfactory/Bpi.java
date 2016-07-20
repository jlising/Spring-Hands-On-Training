package com.trainings.design.patterns.creational.abstractfactory;

public class Bpi implements Bank {
	private String BPINAME;
	
	public Bpi() {
		BPINAME = "Bank of the Philippine Islands";
	}

	public String getBankName() {
		return BPINAME;
	}
}
