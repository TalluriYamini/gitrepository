package com.learn.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Lab821 {
	public static void main(String[] args) {
	TreeSet ts=new TreeSet(new StringDescComparator());
	ts.add( "Manish");
	ts.add("Sri");
	ts.add("Nivas");
	ts.add("Rahul");
	ts.add("DK");
	Iterator it=ts.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	}
}

 class StringDescComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof String && ob2 instanceof String){
		String s1=(String) ob1;
		String s2=(String) ob2;
		//return s2.compareTo(s1);  //desc
		return s1.compareTo(s2);  //asc
		}
		
		return 0;
	}
 }

/*
//desc				 
Sri
Rahul
Nivas
Manish
DK

//asc
 
 DK
Manish
Nivas
Rahul
Sri
 
 

 
*/ 
 