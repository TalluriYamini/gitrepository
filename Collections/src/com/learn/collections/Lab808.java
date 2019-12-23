package com.learn.collections;

import java.util.LinkedHashSet;

class Lab808 {

	public static void main(String[] args) {
		LinkedHashSet set=new LinkedHashSet();
		set.add(new Long(65));
		set.add(new Byte((byte)65));
		set.add(new Integer(65));
		set.add("A");
		
		System.out.println(set);
	}
}

// output

/*
	
				[65, 65, 65, A]

	
 */
