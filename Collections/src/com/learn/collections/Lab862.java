package com.learn.collections;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

class Lab862 {
	public static void main(String[] args) throws IOException {
		String languageCode="en";
		System.out.println("H->HINDI,E->ENGLISH");
		System.out.println("Enter your Choice");
		int asc=System.in.read();
		char ch=(char)asc;
		ch=Character.toUpperCase(ch);
		if(ch=='H'){
			System.out.println("\t**You have selected HINDI");
			languageCode="hi";
		}else if(ch=='E'){
			System.out.println("\t You Have Selected ENGLISH");
			languageCode="en";
		}else{
			System.out.println("\t**INVALID INPUT, Using Default LANGUAGE");
		}
		Locale locale=new Locale(languageCode);
		ResourceBundle rdRef=ResourceBundle.getBundle("messages",locale);
		Enumeration en=rdRef.getKeys();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String val=rdRef.getString(key);
			System.out.println(key+"\t"+val);
		}
 	}
}
/*
 
		
*/