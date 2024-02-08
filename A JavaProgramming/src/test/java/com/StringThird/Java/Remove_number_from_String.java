package com.StringThird.Java;
	
public class Remove_number_from_String {

	//Remove numbers from String
	
	public static String removeNumbers(String str) 
	{
		return str.replaceAll("\\d", "");

	}

	public static void main(String[] args) {
		
		String str = "Java Program 123";
		String word = str.replaceAll("\\d", "");
		System.out.println(word);
		//System.out.println(removeNumbers(str));
		
	}

}
