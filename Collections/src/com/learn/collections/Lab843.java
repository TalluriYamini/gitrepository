package com.learn.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Lab843 {
	public static void main(String[] args) {

		Queue<String> que = new PriorityQueue<String>();
		que.add("Srinivas");
		que.add("Manish");
		que.offer("Kumar");
		que.offer("Dande");
		que.add("Ranjan");
		int len = que.size();
		for (int i = 0; i < len; i++) {
			System.out.println(que.poll());
		}
		System.out.println("\n*****************");

		Queue<String> que2 = new PriorityQueue<String>(10,new PSort());
		que2.add("Srinivas");
		que2.add("Manish");
		que2.offer("Kumar");
		que2.offer("Dande");
		que2.add("Ranjan");
		int len2 = que2.size();
		for (int i = 0; i < len2; i++) {
			System.out.println(que2.poll());
		}
	}
}

class PSort implements Comparator<String> {
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

/*
 
					Dande
					Kumar
					Manish
					Ranjan
					Srinivas
					
					*****************
					Srinivas
					Ranjan
					Manish
					Kumar
					Dande


 */
