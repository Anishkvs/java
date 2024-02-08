package com.StringSecond.Java;

public class String_Split_by_comma{
	//String Split by comma
	public static void main(String[] args) {
		
		String word = "apple,orange,mango,watermelon";
		
		String[] fruits = word.split(",");
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		
	}
	
	
}
