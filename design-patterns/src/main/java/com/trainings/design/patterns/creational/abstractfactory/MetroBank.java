package com.trainings.design.patterns.creational.abstractfactory;

public class MetroBank implements Bank {
	private String METROBANK;
	
	public MetroBank() {
		METROBANK = "Metro Bank";
	}

	public String getBankName() {
		return METROBANK;
	}
}
