package com.learn.collections;

import java.util.ArrayList;
import java.util.Collection;


class Lab785 {
	
	public static void main(String[] args) {
		Collection col=new ArrayList();
		col.add("Sri"); col.add("Srininas");
		col.add("SD"); col.add("Dande");
		System.out.println(col+"\t"+col.size());
		Collection col2=new ArrayList();
		col2.add("java"); col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col2+"\t"+col2.size());
		col.addAll(col2);
		System.out.println(col+"\t"+col.size());
	}
}



//output

/*					
				[Sri, Srininas, SD, Dande]	4
				[java, JDBC, JSP]	3
				[Sri, Srininas, SD, Dande, java, JDBC, JSP]	7
		*/		

