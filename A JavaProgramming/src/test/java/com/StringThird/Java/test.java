package com.StringThird.Java;

public class test {
	//Reverse word at same place
	public static void main(String[] args) {
		
		String str = "Welcome Java";
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for(String word: words) {
		
			String reverseWord = "";
			
		for(int i=word.length()-1; i>=0; i--)
		{
			reverseWord = reverseWord + word.charAt(i);
		}
		reverseString = reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
		
		
	}
}
