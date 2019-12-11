package com.learn.exception;

public class Lab722 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int res=10/3;
			System.out.println("result : "+res);
		} catch (Exception e){
			System.out.println("*Invalid iNput");
		}finally {
			System.out.println("Finaly block");
		}
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*

					Main Starts
					result : 3
					Finaly block
					Main ends

 
 
 */
