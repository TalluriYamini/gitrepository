package com.learn.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Lab817 {
	public static void main(String[] args) {
	
		System.out.println("**Student Info***");
		TreeSet set=new TreeSet();
		set.add(new Employee817(87,"Sri"));
		set.add(new Employee817(99,"Dande"));
		set.add(new Employee817(12,"SD"));
		set.add(new Employee817(45,"Nivas"));
		Iterator it=set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}

class Employee817 implements Comparable{
	int eid;
	String name;
	public Employee817(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
public int compareTo(Object obj) {
	if(obj instanceof Employee817){
		Employee817 em=(Employee817) obj;
		return this.name.compareTo(em.name);
	}
	return 0;
}
	public String toString() {
		return eid+"\t"+name;
	}
	
}


/*
 
				**Student Info***
				99	Dande
				45	Nivas
				12	SD
				87	Sri
 
 
					
*/
