package com.git.code;

import java.util.StringTokenizer;

public class GitStringTokenizerMethods {

	public static void main(String args[]) {
		String mydelim = " : ";
		String mystr = "JAVA : Code : String : Tokenizer : Geeks";

		// Use of Constructor 2
		// Here we are passing Delimiter - "mydelim"
		StringTokenizer geeks3 = new StringTokenizer(mystr, mydelim);

		// Printing count of tokens and tokens
		int count = geeks3.countTokens();
		System.out.println("Number of tokens : " + count + "\n");
		for (int i = 0; i < count; i++)
			System.out.println("token at [" + i + "] : " + geeks3.nextToken());

		// .hasMoreTokens() method checks for more Tokens.
		// Here not working as no Tokens left
		while (geeks3.hasMoreTokens()) {

			// .nextToken is method is returning next token.
			System.out.println(geeks3.nextToken());
		}

		// use of hasMoreElements() - true if tokens are present
		while (geeks3.hasMoreElements()) {

			// use of nextElement() - returns the next token
			System.out.println(geeks3.nextElement());
		}
	}

}
