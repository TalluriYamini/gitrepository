package com.learn.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lab811 {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);ts.add(5);ts.add(7);
		ts.add(11);ts.add(3); ts.add(9);
		ts.add(4);ts.add(20);
		System.out.println(ts);
		Set ts1=ts.descendingSet();
		System.out.println(ts1);
		System.out.println("**Ascending Order");
		Iterator it= ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println("**Descending Oreder**");
		Iterator it1= ts.descendingIterator();
		while(it1.hasNext())
			System.out.println(it1.next());
 	}
}

// output

/*

						[3, 4, 5, 7, 9, 10, 11, 20]
						[20, 11, 10, 9, 7, 5, 4, 3]
						**Ascending Order
						3
						4
						5
						7
						9
						10
						11
						20
						**Descending Oreder**
						20
						11
						10
						9
						7
						5
						4
						3

 */
