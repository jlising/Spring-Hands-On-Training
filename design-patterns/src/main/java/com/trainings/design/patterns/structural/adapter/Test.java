package com.trainings.design.patterns.structural.adapter;

public class Test {

	public static void main(String[] args) {
		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}

}
