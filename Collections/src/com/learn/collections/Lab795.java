package com.learn.collections;

import java.util.Enumeration;
import java.util.Vector;

class Lab795 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Sri");
		v.add("Nivas");
		v.add("DAnde");
		v.add("SD");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		System.out.println(enu.nextElement());
	}
}

// output

/*
					
					Sri
					Nivas
					DAnde
					SD

 */
