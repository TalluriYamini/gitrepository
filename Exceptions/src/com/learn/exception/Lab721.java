package com.learn.exception;

public class Lab721 {

	public static void main(String[] args) {
		System.out.println("Main Starts");
		try {
			int res=10/3;
			System.out.println("result : "+res);
		} catch (Exception e){
			System.out.println("*Invalid iNput");
		}
		System.out.println("Main ends");
	}
}

// java Lab714 value(numeric)

// output:

/*

				Main Starts
				result : 3
				Main ends
 
 
 */
