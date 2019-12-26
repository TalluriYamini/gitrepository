package com.learn.exception;


public class Lab711 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try{
		//String data=args[0];
		//int x=Integer.parseInt("qwer");
		int res=10/0;
		System.out.println("Result os: "+res);
		}catch(ArrayIndexOutOfBoundsException e )
		{System.out.println("Provide One value as CLA");
		}catch (NumberFormatException e) {
		System.out.println("proveide int value as CLA");
		}catch (ArithmeticException e) {
			System.out.println("proveide non Zero value as CLA");
			}
		
		System.out.println("Main ends");
	}
}

// java Lab711 value(numeric)


// output:

/*
				Main Starts
				Provide One value as CLA
				Main ends		 
					
 */
