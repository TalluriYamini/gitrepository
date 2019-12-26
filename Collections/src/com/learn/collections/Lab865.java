package com.learn.collections;

import java.util.Scanner;

class Lab865 {
	public static void main(String[] args) {
		String str = "Hi This is JLC";
		Scanner sc = new Scanner(str);
		while (sc.hasNext()) {
			String st = sc.next();
			System.out.println(st);
		}
		sc.close();
		System.out.println("**********");
		String str2 = "Hi This is JLC. Java Training Center. No 1 in Java Training";
		Scanner sc1 = new Scanner(str2);
		sc1.useDelimiter("\\.");
		while (sc1.hasNext()) {
			String st = sc1.next();
			System.out.println(st);
		}
		sc1.close();
	}
}

/*				
				Hi
				This
				is
				JLC
				**********
				Hi This is JLC
				 Java Training Center
				 No 1 in Java Training
				 
*/