package com.StringThird.Java;
	
public class Fibonacci_Series {
	//Fibonacci Series 
	
	public static void main(String[] args) {
		
	  int f = 0;
	  int s = 1;
	  int t;
	  System.out.print(f+" "+s);
	  for(int i = 0; i < 10; i++)
	  {
		  t = f+s;
		  System.out.print(" "+ t);
		  f = s;
		  s = t;
	  }
	
	}
}
