package com.String.Java;

public class Total_Single_count_Character {

	public static void main(String[] args) {
		// Find the Single Char Count In the String

		String word = "Count particular character";

		char search = 'c';
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (search == word.charAt(i))
				count++;
		}

		System.out.println("Count of " + search + " is " + count);

	}
}
