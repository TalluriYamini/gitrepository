package com.practice;

public class StringEg1 {
	public static void main(String[] args) {

		String str = "abcd cbda xy ab xyz abc cda a";
		String[] words = str.split(" ");

		// String[] words = { "abcd", "C", "Python", "Java" };
		for (int i = 0; i < 7; ++i) {
			System.out.println("\n"+"iteration: "+(i+1)+"\n");
			
			for (int j = i + 1; j < 8; ++j) {
				System.out.println(words[i] + ".compareTo(" + words[j] + ") : " + words[i].compareTo(words[j]));
				if (words[i].compareTo(words[j]) > 0) {
					// swap words[i] with words[j[
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
				getwords(words);

				System.out.println(words[i] + ".length()<" + words[j] + ".length()" + " : "
						+ (words[i].length() < words[j].length()));
				if (words[i].length() < words[j].length()) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
				getwords(words);
			}
		}

		System.out.println("In lexicographical order:");
		for (int i = 0; i < 8; i++) {
			System.out.println(words[i]);
		}

		System.out.println("abcd".compareTo("cdba"));
		System.out.println("cdba".compareTo("abcd"));

	}

	private static void getwords(String[] words) {
		System.out.print("[");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}

}
