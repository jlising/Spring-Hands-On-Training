package com.trainings.guava.stringutilities;

import com.google.common.base.Splitter;

public class SplitterDemo {
	public static void main(String args[]) {
		SplitterDemo tester = new SplitterDemo();
		tester.testSplitter();
	}

	private void testSplitter() {
		System.out
				.println(Splitter
						.on(',')
						.trimResults()
						.omitEmptyStrings()
						.split("the ,quick, ,brown, fox, jumps, over, the, lazy, little dog."));
	}
}
