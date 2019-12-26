package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Lab849 {
	public static void main(String[] args) {

		List list=new ArrayList<>();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println("\nSorting in Ascending");
		Collections.sort(list);
		System.out.println(list);//[Dande, Kumar, Nivas, Nivas, Srinivas]
		System.out.println("\n Sorting in Descending");
		Collections.sort(list,new StringDescComp());
		System.out.println(list);//[Srinivas, Nivas, Nivas, Kumar, Dande]
	
	}
}


class StringDescComp implements Comparator{
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
