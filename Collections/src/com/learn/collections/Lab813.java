package com.learn.collections;

import java.util.TreeSet;

import javax.sound.midi.Synthesizer;

class Lab813 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);ts.add(5);ts.add(7);
		ts.add(11);ts.add(3); ts.add(9);
		ts.add(4);ts.add(20);
		System.out.println("**pollFirst/Last**");
		System.out.println(ts);//[3, 4, 5, 7, 9, 10, 11, 20]
		System.out.println(ts.pollFirst());//3
		System.out.println(ts);//[4, 5, 7, 9, 10, 11, 20]
		System.out.println(ts.pollLast());//20
		System.out.println(ts);//[4, 5, 7, 9, 10, 11]
		System.out.println("***lower()<***");
		System.out.println(ts.lower(8));//7
		System.out.println(ts.lower(2));//null
		
		System.out.println("***Higher()>***");
		System.out.println(ts.higher(8));//9
		System.out.println(ts.higher(50));//null
		System.out.println(ts.higher(3));//4
		System.out.println("**8ceiling()>=***");
		System.out.println(ts.ceiling(8));//9
		System.out.println(ts.ceiling(12));//null
		System.out.println("***floor()<=");
		System.out.println(ts.floor(8));//7
		System.out.println(ts.floor(3));//null
		
		
 	}
}

// output

/*

				**pollFirst/Last**
				[3, 4, 5, 7, 9, 10, 11, 20]
				3
				[4, 5, 7, 9, 10, 11, 20]
				20
				[4, 5, 7, 9, 10, 11]
				***lower()<***
				7
				null
				***Higher()>***
				9
				null
				4
				**8ceiling()>=***
				9
				null
				***floor()<=
				7
				null




 */
