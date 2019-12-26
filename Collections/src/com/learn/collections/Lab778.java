package com.learn.collections;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Lab778 {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("SRI");
		v.addElement("VAS");
		v.addElement("DANDE");
		System.out.println(v);
		Enumeration en=v.elements();
		while (en.hasMoreElements()) {
			Object object = (Object) en.nextElement();
			 	 System.out.println(object);
			//obj cannot be resolved to a variable
		}
	}
}
