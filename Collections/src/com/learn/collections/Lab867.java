package com.learn.collections;

import java.util.Formatter;

class Lab867 {
	public static void main(String[] args) {
		Formatter fmt1=new Formatter();
		String name ="Hrishi";
		int age=23;
		fmt1.format("My Name is %s and age is %d", name,age);
		System.out.println(fmt1);
		Formatter fmt2=new Formatter();
		fmt2.format("%c-%f-%b%n%05d-%o-%x-%X", 'C',99.99,true,3456,3456,3456,3456);
		System.out.println(fmt2);
	}
}

/*		
 
 
					My Name is Hrishi and age is 23
					C-99.990000-true
					03456-6600-d80-D80


				 
*/