package com.learn.exception;

public class Lab713 {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main Starts");
		try {
			String data = args[0];
			int x = Integer.parseInt(data);
			int res = 10 / x;
			System.out.println("Result os: " + res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Provide One value as CLA");
		} catch (NumberFormatException e) {
			System.out.println("proveide int value as CLA");
		} catch (ArithmeticException e) {
			System.out.println("proveide non Zero value as CLA");
		} catch (Exception e) {
			System.out.println("Provide Currect value");
		}

		System.out.println("Main ends");
	}
}

// java Lab713 value(numeric)

// output:

/*
 
				Main Starts
				Provide One value as CLA
				Main ends
 
 
 */
