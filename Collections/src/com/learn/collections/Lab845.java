package com.learn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

class Lab845 {
	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("Srinivas");
		list.add("Manish");
		list.add("Anand");
		list.add("kumar");
		System.out.println(list);
		System.out.println("\n LIST to ENUMERATION****");
		Enumeration enm=Collections.enumeration(list);
		while (enm.hasMoreElements()) 
			System.out.println(enm.nextElement());
		Vector v=new Vector();
		v.add(99); v.add("Sri"); v.add("sri@jlc.com");
		System.out.println("\nEnumeration to List");
		
		Enumeration enu=v.elements();
		List info=Collections.list(enu);
		System.out.println(info);
	}
}

/*
				
				[Srinivas, Manish, Anand, kumar]
				
				 LIST to ENUMERATION****
				Srinivas
				Manish
				Anand
				kumar
				
				Enumeration to List
				[99, Sri, sri@jlc.com]




 */
