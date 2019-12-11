package com.learn.exception;

public class Lab718 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try {
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("result : "+res);
		} catch (ArrayIndexOutOfBoundsException| NumberFormatException|ArithmeticException e) {
			System.out.println("*provide non zero int value as CLA");
		}
		
		
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*

			Main Starts
			*provide non zero int value as CLA
			Main ends
 
 
 */
