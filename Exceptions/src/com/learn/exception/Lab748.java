package com.learn.exception;

public class Lab748 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");

		try (JLCResource748 res = new JLCResource748();) {
			Lab748 ref =new Lab748();
			Object obj=ref.clone();
		}
		System.out.println("Main Ends");
	}
}

class JLCResource748 implements AutoCloseable {
	public void close() throws Exception {
	}
}

/*
 

					Main Started
					Exception in thread "main" java.lang.CloneNotSupportedException: book2.codes.Lab748
						at java.lang.Object.clone(Native Method)
						at book2.codes.Lab748.main(Lab748.java:10)

 
 */
