package com.learn.exception;

public class Lab720 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int res=10/0;//ArithmeticException
			System.out.println("result : "+res);
		} catch (ArithmeticException e){
			System.out.println("*Invalid iNput");
		}finally {
			System.out.println("finally bolck");
		}
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*

				Main Starts
				*Invalid iNput
				finally bolck
				Main ends

 
 
 */
