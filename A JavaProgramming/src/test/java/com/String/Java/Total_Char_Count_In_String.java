package com.String.Java;

public class Total_Char_Count_In_String {
// Find the total Char Count In the String
	
	public static void main(String[] args) {
		
		String S = "Hi Java";
		int Char = 0;
		
		for(int i=0; i<S.length();i++)
		{
			if(S.charAt(i) !=' ')
			Char++;
		}
		
		System.out.println(Char);
	}
}
