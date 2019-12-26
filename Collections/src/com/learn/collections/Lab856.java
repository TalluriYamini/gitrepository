package com.learn.collections;

import java.util.Date;

class Lab856 {
	public static void main(String[] args) {

		Date dt=new Date();
		System.out.println(dt);
		System.out.println("Date\t"+dt.getDate());
		System.out.println("Mon\t"+dt.getMonth());
		System.out.println("Mon\t"+(dt.getMonth()+1));
		System.out.println("Year\t"+dt.getYear());
		System.out.println("year\t"+(dt.getYear()+1900));
		System.out.println("Hour\t"+dt.getHours());
		System.out.println("min\t"+dt.getMinutes());
		System.out.println("sec\t"+dt.getSeconds());
		
		
		System.out.println("\n Storing Date");
		dt.setDate(9);
		dt.setMonth(2);
		dt.setYear(108);
		System.out.println(dt);//Sun Mar 09 12:47:48 IST 2008
		
	
	}
}

/*

						Thu Apr 21 12:47:48 IST 2016
						Date	21
						Mon	3
						Mon	4
						Year	116
						year	2016
						Hour	12
						min	47
						sec	48
						
						 Storing Date
						Sun Mar 09 12:47:48 IST 2008


*/