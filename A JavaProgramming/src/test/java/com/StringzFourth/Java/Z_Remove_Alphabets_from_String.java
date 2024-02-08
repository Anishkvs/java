package com.StringzFourth.Java;
	
public class Z_Remove_Alphabets_from_String {

	//Remove numbers from String
	
	public static String removeNumbers(String str) 
	{
		return str.replaceAll("[A-Za-z]", "");

	}

	public static void main(String[] args) {
		
		String str = "Java Program 123";
		System.out.println(removeNumbers(str));
		
	}

}
