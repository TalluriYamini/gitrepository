package com.learn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Lab802 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator lit = list.listIterator();
		System.out.println("Forward Order");
		while (lit.hasNext()) { // left to right
			int indx=lit.nextIndex();
			Object obj=lit.next();
			System.out.println(indx+"\t"+obj);
		}
		System.out.println("Reverse Order");
		while (lit.hasPrevious()) {//right to left
			int indx=lit.previousIndex();
			Object obj=lit.previous();
			System.out.println(indx+"\t"+obj);
		}
	}
}

// output

/*
						 
						Forward Order
						0	Sri
						1	Nivas
						2	Dande
						3	Java
						4	JDBC
						5	JSP
						Reverse Order
						5	JSP
						4	JDBC
						3	Java
						2	Dande
						1	Nivas
						0	Sri



 */
