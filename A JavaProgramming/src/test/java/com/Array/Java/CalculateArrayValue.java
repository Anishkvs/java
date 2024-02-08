package com.Array.Java;

public class CalculateArrayValue {
	
		  public static void main(String[] args) {
		    int a[] = {1, 2, 1, 2};
		    int sum = 0;
		      
		    for (int i = 0; i < a.length; i++) 
		    {
		    	sum = sum+a[i];
		    }
		    System.out.println("The sum is: " + sum);
		  }
		}


