package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

class Lab792 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("java");
		list.add("Nivas");
		list.add("JDBC");
		List list2=list.subList(1, 3);//1,2
		System.out.println(list);// [Sri, Nivas, Dande, java, Nivas, JDBC]
		System.out.println(list2);// [Nivas, Dande]
	}
}

// output

/*
				 
			
			



 */
