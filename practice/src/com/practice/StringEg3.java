package com.practice;

public class StringEg3 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String s = sc.next();
		// String[] i = s.split(" ");

		int[] marks = { 20, 100, 30, 40, 50, 60, 40, 20, 80, 85, 90, 90, 94, 94 };
		int rank = 1;
		for (int i = 0; i < marks.length - 1; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					int temp = marks[i];
					marks[i] = marks[j];
					marks[j] = temp;
				}
				if (marks[i] > marks[j]) {
					System.out.print(marks[i] + "-" + (rank++) + ",");
				} else {
					System.out.print(marks[i] + "-" + (rank) + ",");
				}
			}
		}

		for (int i = 0; i < marks.length - 1; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j]) {
					System.out.print(marks[i] + "-" + (rank++) + ",");
				} else {
					System.out.print(marks[i] + "-" + (rank) + ",");
				}
				break;
			}
		}

		/*
		 * System.out.print("["); for (int i = 0; i < marks.length; i++) {
		 * System.out.print(marks[i] + " "); } System.out.print("]");
		 * System.out.println();
		 */

	}
}
