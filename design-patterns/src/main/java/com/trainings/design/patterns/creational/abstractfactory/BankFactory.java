package com.trainings.design.patterns.creational.abstractfactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		
		if (bank.equalsIgnoreCase("BPI")) {
			return new Bpi();
		} else if (bank.equalsIgnoreCase("METROBANK")) {
			return new MetroBank();
		} else if (bank.equalsIgnoreCase("BDO")) {
			return new Bdo();
		}
		
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}
}