package com.String.Java;

public class Vowel_Count {

	public static void main(String[] args) {
		
		//Count of vowels in a String
		// Vowels present or not in a String
		
		String word = "education";
		int count = 0;
		for(int i=0; i<word.length(); i++)
		{
			char ch = word.charAt(i);
			switch(ch)
			{
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o': 
			case 'u': count++; break;
			}
			
		}
		if(count==0)
		{
			System.out.println("No Vowels");
		} else
		System.out.println("Count of Vowels "+count);
		
		
		
	}
	}


