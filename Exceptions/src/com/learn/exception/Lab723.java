package com.learn.exception;


public class Lab723 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		int r=new Hello723().show();
		System.out.println("Main: "+r);
		System.out.println("Main ends");
	}
}

class Hello723{
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
		}finally{
			a=30;
			System.out.println("finally block: " +a);
		}
	}
}


// java Lab714 value(numeric)

// output:

/*
			
			Main Starts
			try block begins: 0
			try block ends: 2
			finally block: 30
			Main: 2
			Main ends

 
 
 */
