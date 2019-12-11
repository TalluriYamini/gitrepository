package com.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringEg4 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String s = sc.next();
		// String[] i = s.split(" ");

		int[] marks = { 20, 100, 100, 30, 40, 20, 50, 60, 40, 20, 80, 85, 90, 90, 94, 94 };
		int rank = 1;
		TreeMap<Integer, Integer> sorted = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < marks.length; i++) {
				if (sorted.containsKey(marks[i])) {
					sorted.put(marks[i], sorted.get(marks[i]) + 1);
				} else {
					sorted.put(marks[i], 1);
				}
		}
		
		/*
		 * TreeMap<Integer, Integer> sorted = new TreeMap<>(Collections.reverseOrder());
		 * sorted.putAll(map);
		 */
       
		//System.out.println(map);
		System.out.println(sorted);

		/*
		 * System.out.print("["); for (int i = 0; i < marks.length; i++) {
		 * System.out.print(marks[i] + " "); } System.out.print("]");
		 * System.out.println();
		 */

	}
}
