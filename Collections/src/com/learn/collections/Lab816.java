package com.learn.collections;

import java.util.Iterator;
import java.util.TreeSet;

class Lab816 {
	public static void main(String[] args) {

		System.out.println("**Student Info***");
		TreeSet set = new TreeSet();
		set.add(new Student816(87, "Sri"));
		set.add(new Student816(99, "Dande"));
		set.add(new Student816(12, "SD"));
		set.add(new Student816(45, "Nivas"));
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}

class Student816 implements Comparable {
	int sid;
	String name;

	public Student816(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public int compareTo(Object obj) {
		if (obj instanceof Student816) {
			Student816 st = (Student816) obj;
			return this.sid - st.sid;
		}
		return 0;
	}

	public String toString() {
		return sid + "\t" + name;
	}

}

/*
 ** 
 * Student Info*** 12 SD 45 Nivas 87 Sri 99 Dande
 * 
 * 
 * 
 */
