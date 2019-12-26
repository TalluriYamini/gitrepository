package com.learn.collections;

import java.util.TreeSet;

class Lab818 {
	public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(new Student818(99, "Sri"));
		
	
	}
}

class Student818{
	int sid; String name;
	Student818(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString(){
		return sid+"\t"+name;
	}
}



					/*Exception in thread "main" java.lang.ClassCastException: book2.codes.Student818 cannot be cast to java.lang.Comparable
					at java.util.TreeMap.compare(Unknown Source)
					at java.util.TreeMap.put(Unknown Source)
					at java.util.TreeSet.add(Unknown Source)
					at book2.codes.Lab818.main(Lab818.java:8)*/