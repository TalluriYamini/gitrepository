package com.learn.collections;

import java.util.Formatter;

class Lab866 {
	public static void main(String[] args) {
		Formatter fmt=new Formatter();
		String res=fmt.format("Sum of %d and %d is %d", 10,20,(10+20)).toString();
		System.out.println(res);
		fmt.close();
	}
}

/*		
 
 
 					Sum of 10 and 20 is 30
				 
*/