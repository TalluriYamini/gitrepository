package com.practice;

public class StringEg2 {
	public static void main(String[] args) {

		String str = "cbga";

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length -1; ++i) {
			for (int j = i + 1; j < c.length; ++j) {
				if (c[i] > c[j]) {
					char ct = c[i];
					c[i] = c[j];
					c[j] = ct;
				}
			}
		}
		str="";
		for (int i = 0; i < c.length; i++) {
			str += c[i];
			
		}
		System.out.println(str);
	}
}
