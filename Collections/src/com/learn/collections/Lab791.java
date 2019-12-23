package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

class Lab791 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("java");
		list.add("Nivas");
		list.add("JDBC");
		System.out.println(list);
		int x = list.indexOf("Nivas");//search left to right
		System.out.println(x);

		int y = list.lastIndexOf("Nivas");//search right to left
		System.out.println(y);

	}
}

// output

/*
				 
				[Sri, Nivas, Dande, java, Nivas, JDBC]
				1
				4


 */
