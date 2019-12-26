package com.learn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Lab800 {

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator it=list.listIterator();
		while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
	}}
}

// output

/*
				
					Sri
					Nivas
					Dande
					Java
					JDBC
					JSP
 */
