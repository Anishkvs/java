package com.StringSecond.Java;

public class String_Split_by_url{
	//String Split by comma
	public static void main(String[] args) {
		
		String word ="//)(*&^%$$#@,https://www.listener.devtools.solutionsbytext$$#@12a,http://webhook-listener.devtools.solutionsbytext.com/37f31057-f939-4a53-8c1e-eb61a2a2bd28,https://.in";
			
	    String s = word.replaceAll("[!@#$%^&*()]","");
	    // System.out.println(s);
	  String[] word2=   s.split(",");
		//System.out.println(word2);
		for(String obj : word2)
		{
			System.out.println(obj);
		}
	}
	
	
}
