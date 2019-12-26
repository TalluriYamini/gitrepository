package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

class Lab847 {
	public static void main(String[] args) {

		List list=new ArrayList<>();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		System.out.println("\nReplacing Nivas with JLC");
		Collections.replaceAll(list, "Nivas", "JLC");//[Srinivas, Dande, JLC, Kumar, JLC]
		System.out.println(list);
		Object mx=Collections.max(list);
		System.out.println("\nMAx OBJ: "+mx);//MAx OBJ: Srinivas

		Object mn=Collections.min(list);
		System.out.println("\nMin OBJ: "+mn);//Min OBJ: Dande
		System.out.println("\nReplacing All with JLC");
		Collections.fill(list, "JLC");
		System.out.println(list);//[JLC, JLC, JLC, JLC, JLC]
	}
}

/*
				

[Srinivas, Dande, Nivas, Kumar, Nivas]

Replacing sd with JLC
[Srinivas, Dande, JLC, Kumar, JLC]

MAx OBJ: Srinivas

Min OBJ: Dande

Replacing All with JLC
[JLC, JLC, JLC, JLC, JLC]


 */
