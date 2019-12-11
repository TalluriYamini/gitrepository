package com.learn.exception;

public class Lab746 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");

		try (JLCResource746 res = new JLCResource746();) {
			int x = 10 / 0;
		}
		System.out.println("Main Ends");
	}
}

class JLCResource746 implements AutoCloseable {
	public void close() throws Exception {
	}
}

/*
 
						Main Started
						Exception in thread "main" java.lang.ArithmeticException: / by zero
							at book2.codes.Lab746.main(Lab746.java:9)
						
						 
 
 
 */
