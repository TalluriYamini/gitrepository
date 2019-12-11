package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillMissingBrackets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int openbkts = 0;
		int closebkts = 0;
		int rslt = 1;
		String rsStr = "";
		List<String> rsStrL = new ArrayList<String>();

		for (char ch : s.toCharArray()) {
			if (ch == '[' || ch == '{' || ch == '(') {
				openbkts++;
			} else if (ch == ']' || ch == '}' || ch == ')') {
				closebkts--;
			} 
		}
		if(s.contains("?")) {
			if(openbkts < closebkts) {
				//s+=
			}
		}
		System.out.println(rslt);
	}
}
