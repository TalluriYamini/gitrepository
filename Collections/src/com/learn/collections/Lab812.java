package com.learn.collections;

import java.util.TreeSet;

class Lab812 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);ts.add(5);ts.add(7);
		ts.add(11);ts.add(3); ts.add(9);
		ts.add(4);ts.add(20);
		System.out.println(ts);//[3, 4, 5, 7, 9, 10, 11, 20]
		System.out.println("**Subset**"); //navigable set
		System.out.println(ts.subSet(4, 11));//[4, 5, 7, 9, 10]
		System.out.println(ts.subSet(4, false, 11, true));//[5, 7, 9, 10, 11]
		System.out.println("**headSet()**"); //start point to till given element
		System.out.println(ts.headSet(9));//[3, 4, 5, 7]
		System.out.println(ts.headSet(9,true));//[3, 4, 5, 7, 9]
		System.out.println(ts.headSet(2));//[]
		System.out.println("**Tailset**"); // from given element to till end
		System.out.println(ts.tailSet(9));//[9, 10, 11, 20]
		System.out.println(ts.tailSet(9, false));//[10, 11, 20]
 	}
}

// output

/*
					[3, 4, 5, 7, 9, 10, 11, 20]
					**Subset**
					[4, 5, 7, 9, 10]
					[5, 7, 9, 10, 11]
					**headSet()**
					[3, 4, 5, 7]
					[3, 4, 5, 7, 9]
					**Tailset**
					[9, 10, 11, 20]
					[10, 11, 20]

 */
