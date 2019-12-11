package com.learn.exception;

public class Lab716 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try {
			int res=10/0;
			System.out.println("result: "+res);
		}catch(NumberFormatException e){
			System.out.println("Invalid Input");
		}		
		//System.out.println("Hrishi");
		catch(Exception e)
		//Multiple markers at this line
		//- Syntax error on token "catch", ( expected
		//	- Syntax error, insert "-> LambdaBody" to complete 
		//LambdaExpression
		//- Syntax error, insert "AssignmentOperator Expression" to complete 
		// Assignment
		//		- Syntax error, insert ";" to complete Statement
		{
			System.out.println("Invalid Input");
		}
		
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*
 * 
 * Main Starts Provide One value as CLA Main ends
 * 
 * 
 */
