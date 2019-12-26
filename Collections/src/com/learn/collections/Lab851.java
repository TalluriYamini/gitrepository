package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Lab851 {
	public static void main(String[] args) {

		List list=new ArrayList<>();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		List synList=Collections.synchronizedList(list);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		System.out.println("synch \t"+synList);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		System.out.println("list \t"+list);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		List unModi=Collections.unmodifiableList(list);
		System.out.println("un Modi\t"+unModi);
		System.out.println("\n**MODIFYING LIST");
		list.add("Manish");
		System.out.println("list \t"+list);//[Srinivas, Dande, Nivas, Kumar, Nivas, Manish]
		System.out.println("un Modi\t"+unModi);//[Srinivas, Dande, Nivas, Kumar, Nivas, Manish]
		//unModi.add("JLCINDIA");//java.lang.UnsupportedOperationException
		

	}
}

/*
							
				synch 	[Srinivas, Dande, Nivas, Kumar, Nivas]
				list 	[Srinivas, Dande, Nivas, Kumar, Nivas]
				un Modi	[Srinivas, Dande, Nivas, Kumar, Nivas]
				
				**MODIFYING LIST
				list 	[Srinivas, Dande, Nivas, Kumar, Nivas, Manish]
				un Modi	[Srinivas, Dande, Nivas, Kumar, Nivas, Manish]


 */
