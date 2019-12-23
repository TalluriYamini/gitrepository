package com.learn.collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class Lab860 {
	public static void main(String[] args) throws ParseException {
		 
		String str="Hi This is JLc, Java Laerning Center";
		StringTokenizer tok=new StringTokenizer(str);
		System.out.println("COunt: "+tok.countTokens());
		while (tok.hasMoreTokens()) {
			String data =  tok.nextToken();
			System.out.println(data);
		}
		System.out.println("Count:" + tok.countTokens());
		System.out.println("\n\nWith, Delimiter\n");
		String data = "99,hrishi,com.hrishi,65979874";
		StringTokenizer tkns=new StringTokenizer(data, ",");
		int id=Integer.parseInt(tkns.nextToken());
		String nm=tkns.nextToken();
		String eml=tkns.nextToken();
		long phn=Long.parseLong(tkns.nextToken());
		System.out.println("Id: "+id);
		System.out.println("Name: "+nm );
		System.out.println("Email: "+eml);
		System.out.println("Phone: "+phn);
		
		
	}
}
/*
 
					COunt: 7
					Hi
					This
					is
					JLc,
					Java
					Laerning
					Center
					Count:0
					
					
					With, Delimiter
					
					Id: 99
					Name: hrishi
					Email: com.hrishi
					Phone: 65979874

*/