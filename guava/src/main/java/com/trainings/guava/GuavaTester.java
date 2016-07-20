package com.trainings.guava;

public class GuavaTester {
	public static void main(String args[]) {
		GuavaTester guavaTester = new GuavaTester();

		Integer a = null;
		Integer b = new Integer(10);

		System.out.println(guavaTester.sum(a, b));
	}

	public Integer sum(Integer a, Integer b) {
		return a + b;
	}
}
