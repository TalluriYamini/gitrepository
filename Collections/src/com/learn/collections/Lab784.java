package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


class Lab784 {
	
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri"); col.add("Srininas");
		col.add("SD"); col.add("Dande");
		System.out.println(col+"\t"+col.size());
		Collection col2=new ArrayList();
		col2.add("java"); col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col2+"\t"+col2.size());
		col.add(col2);
		for(Object c :col) {
			System.out.println(c);
			
		}
		System.out.println(col+"\t"+col.size());
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("b"); l2.add("c");
		l.addAll(l2);
	}
}



//output

/*					

				[Sri, Srininas, SD, Dande]	4
				[java, JDBC, JSP]	3
				[Sri, Srininas, SD, Dande, [java, JDBC, JSP]]	5

		*/		

