package com.learn.collections;

import java.util.Enumeration;
import java.util.Vector;

class Lab794 {

	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration enu=v.elements();
		if(enu.hasMoreElements())
		System.out.println(enu.nextElement());
		System.out.println("main Completed");
	}
}

// output

/*

			main completed

 */
