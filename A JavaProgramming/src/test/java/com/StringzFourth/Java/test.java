package com.StringzFourth.Java;

public class test {
	public static void main(String[] args) {
		//Find the duplicate character /number in the String
		
		//String word = "aabb";

		String word = "1234456777889";
		char[] ch =word.toCharArray();
		
		for(int i=0; i<word.length(); i++) {
			for(int j=i+1; j<word.length(); j++) {
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]+" ");
					break;
				}
			}
		}
		
		
	}
	
	
}
