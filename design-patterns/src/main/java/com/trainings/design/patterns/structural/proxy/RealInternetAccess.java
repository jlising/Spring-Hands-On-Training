package com.trainings.design.patterns.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: "
				+ employeeName);
	}
}
