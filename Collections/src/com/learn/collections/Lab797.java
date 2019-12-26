package com.learn.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Lab797 {

	public static void main(String[] args) {
		List list= new ArrayList();
		Iterator it=list.iterator();
		if(it.hasNext())
		System.out.println(it.next());
		System.out.println("Main Complete");
	}
}

// output

/*
				
				Main Complete


 */
