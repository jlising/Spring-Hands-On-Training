package com.trainings.design.patterns.creational.abstractfactory;

public class EducationLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;  
	}
}
