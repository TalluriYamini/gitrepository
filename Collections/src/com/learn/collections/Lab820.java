package com.learn.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Lab820 {
	public static void main(String[] args) {
	TreeSet ts=new TreeSet(new NameComparator());
	ts.add(new Student820(88, "Manish"));
	ts.add(new Student820(44, "Sri"));
	ts.add(new Student820(22, "Nivas"));
	ts.add(new Student820(99, "Rahul"));
	ts.add(new Student820(77, "Abhi"));
	Iterator it=ts.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	}
}

class Student820{
	int sid; String name;
	Student820(int sid,String name){
		this.sid=sid;
		this.name=name;
	}
	public String toString(){
		return sid+"\t"+name;
	}
}
 class NameComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student820 && ob2 instanceof Student820){
		Student820 s1=(Student820) ob1;
		Student820 s2=(Student820) ob2;
		return s1.name.compareTo(s2.name);
		}
		
		return 0;
	}
 }

/*
				 
				77	Abhi
				88	Manish
				22	Nivas
				99	Rahul
				44	Sri

 
*/ 
 