package com.learn.collections;

import java.util.PriorityQueue;
import java.util.Queue;

class Lab840 {
	public static void main(String[] args) {
		Queue<Stud> que=new PriorityQueue<Stud>();
		que.add(new Stud());que.add(new Stud());
		System.out.println("Main Completed");
	}
}
class Stud{}

/*

			Exception in thread "main" java.lang.ClassCastException: book2.codes.Stud cannot be cast to java.lang.Comparable
				at java.util.PriorityQueue.siftUpComparable(Unknown Source)
				at java.util.PriorityQueue.siftUp(Unknown Source)
				at java.util.PriorityQueue.offer(Unknown Source)
				at java.util.PriorityQueue.add(Unknown Source)
				at book2.codes.Lab840.main(Lab840.java:9)
 */
