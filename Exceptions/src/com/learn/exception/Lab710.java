package com.learn.exception;


public class Lab710 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try{
		String data=args[0];
		int x=Integer.parseInt(data);
		int res=10/x;
		System.out.println("Result os: "+res);
		}catch(Exception e)
		{System.out.println("Enter Correct value");}
		
		System.out.println("Main ends");
	}
}




// output:

/*
				Main Starts
				Enter Correct value
				Main ends		 
					
 */
