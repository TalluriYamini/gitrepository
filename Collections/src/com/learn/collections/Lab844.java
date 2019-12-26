package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Lab844 {
	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Srinivas");
		list.add("Manish");
		list.add("Anand");
		list.add("kumar");
		System.out.println(list);
				//Copy One list to another
		List list2=new ArrayList();
		list2.add("Java"); list2.add("jdbc");
		list2.add("Servlets"); list2.add("JSP");
		System.out.println("List2: "+list2);
		Collections.copy(list2, list);
		System.out.println("List2: "+list2);
	}
}

/*

			[Srinivas, Manish, Anand, kumar]
			List2: [Java, jdbc, Servlets, JSP]
			List2: [Srinivas, Manish, Anand, kumar]




 */
