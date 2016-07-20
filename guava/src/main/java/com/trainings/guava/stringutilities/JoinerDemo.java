package com.trainings.guava.stringutilities;

import com.google.common.base.Joiner;

import java.util.Arrays;

public class JoinerDemo {
	public static void main(String args[]) {
		JoinerDemo tester = new JoinerDemo();
		tester.testJoiner();
	}

	private void testJoiner() {
		System.out.println(Joiner.on(",").skipNulls()
				.join(Arrays.asList(1, 2, 3, 4, 5, null, 6)));
	}
}
