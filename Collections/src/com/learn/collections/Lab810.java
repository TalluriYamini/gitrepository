package com.learn.collections;

import java.util.LinkedHashSet;

class Lab810 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(new Student810(99));
		set.add(new Student810(99));
		set.add(new Student810(99));
		set.add(new Student810(99));
		System.out.println(set);
	}
}

class Student810 {
	int sid;

	Student810(int sid) {
		this.sid = sid;
	}
	public String toString() {
		return ""+sid;
	}
	public int hashCode() {
		System.out.println("**hashCode**");
		return sid;
	}
	public boolean equals(Object obj) {
		System.out.println("**equals**");
		if(obj instanceof Student810){
			Student810 st=(Student810)obj;
			return this.sid==st.sid;
		}
		return false;
	}
}

// output

/*

				**hashCode**
				**hashCode**
				**equals**
				**hashCode**
				**equals**
				**hashCode**
				**equals**
				[99]



 */
