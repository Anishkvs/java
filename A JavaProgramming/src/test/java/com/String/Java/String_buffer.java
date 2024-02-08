package com.String.Java;

public class String_buffer{
	
	public static void main(String[] args) {

		String a = "Test";
		String b = "Other";
		
		StringBuffer ob = new StringBuffer("Hello");
		ob.append(" Second");
		System.out.println(ob);
		ob.insert(5, "Key");
		ob.insert(5, " ");
		ob.deleteCharAt(9);
		System.out.println(ob);
		ob.replace(2, 4, "!!");
		System.out.println(ob);
		ob.deleteCharAt(14);
		System.out.println(ob);
		ob.reverse();
		System.out.println(ob);
	
	}
	
	
	
	//String tokensier
	//switch case
	//Input string reader
	//
	
}
