package com.String.Java;

public class Total_Word_In_String {
// Find total number of words in a String
	
	public static void main(String[] args) {
		
		String S = "This is Hello world";
		int count = 1;
		for(int i=0; i<S.length(); i++)
		{
			if(S.charAt(i)==' ')
			count++;
		}
				
		System.out.println(count);
				
		
	}
}
