package com.learn.exception;

public class Lab717 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		String data=null;
		try {
			data=args[0];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("* provide one value as CLA Input");
		}
		int x=0;
		try {
			x=Integer.parseInt(data);
		} catch (NumberFormatException e) {
			System.out.println("*Provide int value as CLA");
		}
		
		try {
			int res=10/x;
			System.out.println("reuslt: "+res);
		} catch (ArithmeticException e) {
			System.out.println("*provide non zero int value as CLA");
		}
		
		
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*

			Main Starts
			* provide one value as CLA Input
			*Provide int value as CLA
			*provide non zero int value as CLA
			Main ends
 
 
 */
