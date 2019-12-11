package com.learn.exception;


public class Lab749 {

	public static void main(String[] args) throws Exception {
		System.out.println("Main Started");
		Student749 sarr[] = new Student749[5000];
		try {
			for (int i = 0; i < sarr.length; i++) {
				sarr[i] = new Student749();
				System.out.println((i + 1) + "Object created");
			}
		} catch (Error e) {
			System.out.println("\n**Error occured: " + e);
		}
		System.out.println("\nAfter Handelling");
		Student749 st = new Student749();
		System.out.println("Main Ends");
	}
}

class Student749 {
	long arr[] = new long[215833];
}

/*
 




 */
