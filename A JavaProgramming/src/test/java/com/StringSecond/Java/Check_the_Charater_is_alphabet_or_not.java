package com.StringSecond.Java;
	
public class Check_the_Charater_is_alphabet_or_not {

	//Check char is alphabet or not
	
	public static void main(String[] args) {
		
		char c = 'B';
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		{
			System.out.println(c+ " is alphabet");
		} else  
		{			
			System.out.println(c+ " is not alphabet");		
		}
	}
	

}
