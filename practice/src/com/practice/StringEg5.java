package com.practice;

import java.util.Scanner;

public class StringEg5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
				
		String[] sarr = s.split(" ");
		String temp="";
		for (String i : sarr) {
			if(i.startsWith("\"") && i.endsWith("\"")) {
				System.out.println(i);
			}else if (i.startsWith("\"")) {
				temp+=i+" ";
			}else if(i.endsWith("\"")) {
				temp+=i;
				System.out.println(temp);
			}else if(!temp.equals(""))  {
				temp+=i+" ";
			}else {
				System.out.println(i+" ");			
			}
		}

	}
}

//qwrwr "qdwr" frwerwq "qwrqwr" qwrqwr "qwerqw qwrqwr qwrqw"