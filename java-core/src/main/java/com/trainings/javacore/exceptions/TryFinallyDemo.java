package com.trainings.javacore.exceptions;

public class TryFinallyDemo {
	static String[] str = {"a","b"};
	
	public static void main(String args []){
		try{
			System.out.println(str[2]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Catched error.");
		}finally{
			System.out.println("Finally executed.");
		}
	}
}
