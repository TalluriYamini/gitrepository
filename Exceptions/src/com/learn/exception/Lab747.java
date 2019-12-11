package com.learn.exception;

public class Lab747 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");

		//try () 
		//Syntax error on token
		//"(", Resources expected after this token
		{
			int x = 10 / 0;
		}
		System.out.println("Main Ends");
	}
}

class JLCResource747 implements AutoCloseable {
	public void close() throws Exception {
	}
}

/*
 
					
 
 */
