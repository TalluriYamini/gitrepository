package com.learn.collections;

import java.util.TreeSet;

class Lab815 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		ts.add(new Employee815()); 
		ts.add(new Employee815());
		ts.add(new Employee815());
		ts.add(new Employee815());
	
	}
}

class Employee815{}


/*
					Exception in thread "main" java.lang.ClassCastException: book2.codes.Employee815 cannot be cast to java.lang.Comparable
					at java.util.TreeMap.compare(Unknown Source)
					at java.util.TreeMap.put(Unknown Source)
					at java.util.TreeSet.add(Unknown Source)
					at book2.codes.Lab815.main(Lab815.java:10)
					
*/
