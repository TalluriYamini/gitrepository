package com.learn.exception;


public class Lab727 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		int r=new Hello727().show();
		System.out.println("Main: "+r);
		System.out.println("Main ends");
	}
}

class Hello727{
	int show(){
		int a= 0;
		try {
			System.out.println("try block begins: "+a);
			a=10/4;
			System.out.println("try block ends: "+a);
			return a;
		} catch (ArithmeticException e) {
			a=20;
			System.out.println("catch block: "+a);
			return a;
		}finally
		{
			System.out.println("finally block: " +a);
			int arr[]=new int[-1];
		}
	}
}


// java Lab714 value(numeric)

// output:

/*
							
		Main Starts
		try block begins: 0
		try block ends: 2
		finally block: 2
		Exception in thread "main" java.lang.NegativeArraySizeException
			at book2.codes.Hello727.show(Lab727.java:29)
			at book2.codes.Lab727.main(Lab727.java:8)s
	
 
 */
