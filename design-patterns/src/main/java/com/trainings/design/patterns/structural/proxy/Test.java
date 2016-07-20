package com.trainings.design.patterns.structural.proxy;

public class Test {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");  
        access.grantInternetAccess(); 
	}

}
