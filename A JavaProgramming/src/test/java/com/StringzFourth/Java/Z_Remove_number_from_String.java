package com.StringzFourth.Java;
	
public class Z_Remove_number_from_String {

	//Remove numbers from String
	
	public static String removeNumbers(String str) 
	{
		return str.replaceAll("\\d", "");

	}

	public static void main(String[] args) {
		
		String str = "Java Program 123";
		//removeNumbers(str);
		System.out.println(removeNumbers(str));
		
	}

}
