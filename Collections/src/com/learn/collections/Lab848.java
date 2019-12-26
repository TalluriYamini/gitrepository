package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Lab848 {
	public static void main(String[] args) {

		List list=new ArrayList<>();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);//[Srinivas, Dande, Nivas, Kumar, Nivas]
		System.out.println("\nREVERSE");
		Collections.reverse(list);
		System.out.println(list);//[Nivas, Kumar, Nivas, Dande, Srinivas]
		System.out.println("\nROTATE(2)");//clockwise
		Collections.rotate(list,2);
		System.out.println(list);//[Dande, Srinivas, Nivas, Kumar, Nivas]
		System.out.println("\nROTATE(-3)");//anti clockwise
		Collections.rotate(list,-3);
		System.out.println(list);//[Kumar, Nivas, Dande, Srinivas, Nivas]
		System.out.println("\nSHUFFLE");
		for (int i = 0; i < 5; i++) {
		Collections.shuffle(list);
		System.out.println(list);
		}
	}
}

/*
							
			
	[Srinivas, Dande, Nivas, Kumar, Nivas]

REVERSE
[Nivas, Kumar, Nivas, Dande, Srinivas]

ROTATE(2)
[Dande, Srinivas, Nivas, Kumar, Nivas]

ROTATE(-3)
[Kumar, Nivas, Dande, Srinivas, Nivas]

SHUFFLE
[Kumar, Nivas, Srinivas, Dande, Nivas]
[Nivas, Dande, Kumar, Srinivas, Nivas]
[Dande, Nivas, Srinivas, Nivas, Kumar]
[Nivas, Dande, Srinivas, Nivas, Kumar]
[Kumar, Nivas, Dande, Nivas, Srinivas]

 */
