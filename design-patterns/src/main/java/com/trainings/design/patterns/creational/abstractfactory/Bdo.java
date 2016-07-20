package com.trainings.design.patterns.creational.abstractfactory;

public class Bdo implements Bank {
	private String BDO;
	
	public Bdo() {
		BDO = "Banco De Oro";
	}

	public String getBankName() {
		return BDO;
	}
}
