package com.learn.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Lab819 {
	public static void main(String[] args) {
	TreeSet ts=new TreeSet(new SidComparator());
	ts.add(new Student819(88, "manish"));
	ts.add(new Student819(44, "Sri"));
	ts.add(new Student819(22, "nivas"));
	ts.add(new Student819(99, "Rahul"));
	ts.add(new Student819(77, "abhi"));
	Iterator it=ts.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	}
}

class Student819{
	int sid; String name;
	Student819(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString(){
		return sid+"\t"+name;
	}
}
 class SidComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student819 && ob2 instanceof Student819){
		Student819 s1=(Student819) ob1;
		Student819 s2=(Student819) ob2;
		return s1.sid-s2.sid;
		}
		
		return 0;
	}
 }

/*
			 22	nivas
			 44	Sri
			 77	abhi
			 88	manish
			 99	Rahul

 
*/ 
 