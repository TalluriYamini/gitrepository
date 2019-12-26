package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Lab796 {

	public static void main(String[] args) {
		List list= new ArrayList();
		Iterator it=list.iterator();
		System.out.println(it.next());
		System.out.println("Main Complete");
	}
}

// output

/*
				Exception in thread "main" java.util.NoSuchElementException
					at java.util.ArrayList$Itr.next(Unknown Source)
					at book2.codes.Lab796.main(Lab796.java:12)
 */
