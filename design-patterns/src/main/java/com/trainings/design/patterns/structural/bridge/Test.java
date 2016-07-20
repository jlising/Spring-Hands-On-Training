package com.trainings.design.patterns.structural.bridge;

public class Test {

	public static void main(String[] args) {
		QuestionFormat questions = new QuestionFormat("Java Programming Language");
		questions.q = new JavaQuestions();
		
		questions.delete("what is class?");
		
		questions.display();
		
		questions.newOne("What is inheritance? ");

		questions.newOne("How many types of inheritance are there in java?");
		questions.displayAll();

	}

}
