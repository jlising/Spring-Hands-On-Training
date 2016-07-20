package com.trainings.guava;

import com.google.common.base.Optional;

public class GuavaTesterOptional {
	public static void main(String args[]) {
		GuavaTesterOptional guavaTesterOptional = new GuavaTesterOptional();

		Integer invalidInput = null;

		Optional<Integer> a = Optional.of(invalidInput);
		Optional<Integer> b = Optional.of(new Integer(10));
		System.out.print(Optional.absent());
		//System.out.println(guavaTesterOptional.sum(a, b));
	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		return a.get() + b.get();
	}
}
