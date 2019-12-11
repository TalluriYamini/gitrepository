package com.practice;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean rst = true;
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				rst = false;
				break;
			}
				i++;
				j--;
			
		}

		System.out.println(rst);
	}
}
