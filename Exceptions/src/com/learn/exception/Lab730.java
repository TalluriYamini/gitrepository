package com.learn.exception;

public class Lab730 {

	public static void main(String[] args) {
		System.out.println("Stmt 0");
		try {
			System.out.println("stmt 1");
			try {
				System.out.println("stmt 2");
			} catch (Exception e) {
				System.out.println("stmt 3");
			} finally {
				System.out.println("stmt 4");
			}
			System.out.println("stmt 5");
		} catch (Exception e) {
			System.out.println("stmt 6");
			try {
				System.out.println("stmt 7");
			} catch (Exception e1) {
				System.out.println("stmt 8");
			} finally {
				System.out.println("stmt 9");
			}
			System.out.println("stmt 10");
		} finally {
			System.out.println("stmt 11");
			try {
				System.out.println("stmt 12");
			} catch (Exception e) {
				System.out.println("stmt 13");
			} finally {
				System.out.println("stmt 14");
			}
			System.out.println("stmt 15");
		}
		System.out.println("stmt 16");
	}
}

// java Lab714 value(numeric)

// output:

/*
 
							Stmt 0
							stmt 1
							stmt 2
							stmt 4
							stmt 5
							stmt 11
							stmt 12
							stmt 14
							stmt 15
							stmt 16
 
 
 */
