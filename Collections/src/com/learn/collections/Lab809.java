package com.learn.collections;

import java.util.LinkedHashSet;

class Lab809 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Student809(99));
		set.add(new Student809(99));
		set.add(new Student809(99));
		set.add(new Student809(99));
		System.out.println(set);
	}
}

class Student809 {
	int sid;

	Student809(int sid) {
		this.sid = sid;
	}
	public String toString() {
		return ""+sid;
	}
}

// output

/*
					 [99, 99, 99, 99]
 */
