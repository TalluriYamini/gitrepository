package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Lab832 {
	public static void main(String[] args) {
		System.out.println("\n --- Using Generic With List--");
		List<String> list=new ArrayList<String>();
		list.add("Srinivas");
		list.add("manish");
		list.add("Dharmendra");
		list.add("Dande");
		//list.add(new Integer(12));
		Iterator<String> it=list.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}

/*
 

				 --- Using Generic With List--
				Srinivas
				manish
				Dharmendra
				Dande


 */
