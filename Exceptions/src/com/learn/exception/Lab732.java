package com.learn.exception;

public class Lab732 {

	public static void main(String[] args) {

		System.out.println("Main Started");
		int x = 10 / 0;
		System.out.println("main Completed");
	}
}




/*
			Main Started
			Exception in thread "main" java.lang.ArithmeticException: / by zero
				at book2.codes.Lab732.main(Lab732.java:8)
*/				