package com.learn.collections;

import java.util.Enumeration;
import java.util.Vector;

class Lab793 {

	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration enu=v.elements();
		System.out.println(enu.nextElement());
		System.out.println("main Completed");
	}
}

// output

/*

				Exception in thread "main" java.util.NoSuchElementException: Vector Enumeration
					at java.util.Vector$1.nextElement(Unknown Source)
					at book2.codes.Lab793.main(Lab793.java:11)

 */
