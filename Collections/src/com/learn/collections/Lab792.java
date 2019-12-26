package com.learn.collections;

import java.util.ArrayList;
import java.util.List;

class Lab792 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");//0
		list.add("Nivas");//1
		list.add("Dande");//2
		list.add("java");//3
		list.add("Nivas");//4
		list.add("JDBC");//5
		List list2=list.subList(1, 3);//1,2
		System.out.println(list);// [Sri, Nivas, Dande, java, Nivas, JDBC]
		System.out.println(list2);// [Nivas, Dande]
	}
}

// output

/*
				 
			
			



 */
