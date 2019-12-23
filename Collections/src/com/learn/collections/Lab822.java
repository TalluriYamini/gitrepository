package com.learn.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Lab822 {
	public static void main(String[] args) {
	TreeSet ts=new TreeSet(new SBComparator());
	ts.add( new StringBuilder("Manish"));
	ts.add( new StringBuilder("Sri"));
	ts.add( new StringBuilder("Nivas"));
	ts.add( new StringBuilder("Rahul"));
	ts.add( new StringBuilder("DK"));
	Iterator it=ts.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	
	}
}

 class SBComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof StringBuilder && ob2 instanceof StringBuilder){
		String s1= ob1.toString();
		String s2=ob2.toString();
		return s1.compareTo(s2);  //desc
		//return s2.compareTo(s1);  //asc
		
		}
		
		return 0;
	}
 }

/*
 
 //desc
 
 DK
Manish
Nivas
Rahul
Sri
 
 
//asc				 
Sri
Rahul
Nivas
Manish
DK


 
 

 
*/ 
 