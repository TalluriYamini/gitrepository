package com.learn.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Lab833 {
	public static void main(String[] args) {
		System.out.println("\n --- Using Generic With Set--");
		Set<String> set=new HashSet<String>();
		set.add("Srinivas");
		set.add("manish");
		set.add("Dharmendra");
		set.add("Dande");
		//set.add(new Integer(12));
		Iterator<String> it=set.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}

/*
 

				 --- Using Generic With Set--
				Srinivas
				Dharmendra
				Dande
				manish


 */
