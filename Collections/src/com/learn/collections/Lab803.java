package com.learn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Lab803 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator lit = list.listIterator();
		System.out.println(lit);
		do {
			int indx = lit.nextIndex();
			Object obj = lit.next();
			System.out.println(indx + "\t" + obj);
		} while (lit.hasNext());
		System.out.println();
		lit=list.listIterator(5);
		do {
			int indx = lit.previousIndex();
			Object obj = lit.previous();
			System.out.println(indx + "\t" + obj);
		} while (lit.hasPrevious());
	}
}

// output

/*
							0	Sri
							1	Nivas
							2	Dande
							3	Java
							4	JDBC
							5	JSP
							
							4	JDBC
							3	Java
							2	Dande
							1	Nivas
							0	Sri
 */
