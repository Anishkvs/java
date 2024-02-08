package com.StringSecond.Java;

public class test {

	public static void main(String[] args) {

		String input = "Java is my language";
		String[] words = input.split(" ");
		
		String longestWord =findLongestWord(words);
		
		System.out.println(longestWord);
	}

	private static String findLongestWord(String[] words) {

		String longestWord ="";
		for (String word : words) 
		{
			if(word.length()>longestWord.length())
			{
				longestWord =word;
			}
		}
		return longestWord;
	}
}