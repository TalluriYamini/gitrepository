package com.learn.exception;

public class Lab715 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try {
			int res=10/0;
			System.out.println("result: "+res);
		}
		//Syntax error, insert 
		//"Finally" to complete TryStatement
		//System.out.println("result");
		catch(NumberFormatException e)
		//Syntax error on token "catch", ( expected
		{
			System.out.println("Invalid Input");
		}
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*
 */
