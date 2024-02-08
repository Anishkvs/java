package com.StringzFourth.Java;

public class Find_longest_word_in_String_Update {
	// To find the longest word in the string

	public static void main(String[] args) {
		String input = "Java for you channel";
		String[] words = input.split(" ");

		String longestWord = findLongestWord(words);

		System.out.println("The longest word is: " + longestWord);
	}

	public static String findLongestWord(String[] words) {
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		return longestWord;
	}

}
