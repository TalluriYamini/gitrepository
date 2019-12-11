package com.learn.exception;


public class Lab729 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		new Hello729().show("3");
		System.out.println("Main ends");
	}
}

class Hello729{
	void show( String str){
		System.out.println("show() called");
		try {
			System.out.println("try block started");
			int a=Integer.parseInt(str);
			int b=10/a;
			System.out.println("try nlock completed: "+b);
			
		
		} catch (ArithmeticException e) {
			System.out.println("catch block");
			System.exit(0);
			}finally {
				System.out.println("finally block");
			}
	}
}


// java Lab714 value(numeric)

// output:

/*
										
			Main Starts
			show() called
			try block started
			try nlock completed: 3
			finally block
			Main ends		
							
 */
