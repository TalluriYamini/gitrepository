package com.learn.collections;

//StringBuilder sorting using Comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Lab850 {
	public static void main(String[] args) {

		List list=new ArrayList<>();
		list.add(new StringBuilder("Srinivas"));
		list.add(new StringBuilder("Dande"));
		list.add(new StringBuilder("Nivas"));
		list.add(new StringBuilder("Kumar"));
		list.add(new StringBuilder("Nivas"));
		System.out.println(list);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		//Collections.sort(list);//java.lang.ClassCastException
		System.out.println("\n Sorting StringBuilder");
		Collections.sort(list,new StringBuilderComp());
		System.out.println(list);//[Srinivas, Nivas, Nivas, Kumar, Dande]	
	}
}


class StringBuilderComp implements Comparator{
	public int compare(Object ob1, Object ob2) {
		String s1=ob1.toString();
		String s2=ob2.toString();
		return s2.compareTo(s1);

	}
}

/*
							
							
				Sorting in Ascending
				[Dande, Kumar, Nivas, Nivas, Srinivas]
				
				 Sorting in Descending
				[Srinivas, Nivas, Nivas, Kumar, Dande]

 */
