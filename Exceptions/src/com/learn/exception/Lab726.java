package com.learn.exception;


public class Lab726 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		int r=new Hello726().show();
		System.out.println("Main: "+r);
		System.out.println("Main ends");
	}
}

class Hello726{
	int show(){
		int a= 0;
		try {
			System.out.println("try block begins: "+a);
			a=10/0;
			System.out.println("try block ends: "+a);
			return a;
		} catch (ArithmeticException e) {
			a=20;
			System.out.println("catch block: "+a);
			return a;
		}finally
		//warning:
		//finally block does not complete normally
		{
			a=30;
			System.out.println("finally block: " +a);
			return a;
		}
	}
}


// java Lab714 value(numeric)

// output:

/*
							
				Main Starts
				try block begins: 0
				catch block: 20
				finally block: 30
				Main: 30
				Main ends
	
 
 */
