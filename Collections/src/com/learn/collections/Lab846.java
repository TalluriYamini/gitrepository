package com.learn.collections;

import java.util.Collections;
import java.util.List;
import java.util.Set;

class Lab846 {
	public static void main(String[] args) {

		Set s=Collections.singleton("JLC");
		System.out.println(s);
		s.add("HELLO");
		//java.lang.UnsupprtedOperationException
		List list=Collections.singletonList("JLC");
		System.out.println(list);
		list.add("HELLO");
		//java.lang.UnsupprtedOperationException
	}
}

/*
				

 */
