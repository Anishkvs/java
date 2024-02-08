package Anagram;

import java.util.Arrays;

public class Sort_alpha_numeric {

	// Given String = B3A2C1,
	// Split to different arrays alphabets and number
	// sort the arrays Output = 123ABC
	public static void main(String[] args) {

		int num = 4512455;
//	Convert Integer to String:

		String word = Integer.toString(num);
	//	String word = "B3A2C1";

		char[] c = word.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
	}

}
