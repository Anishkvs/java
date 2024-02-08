package com.Array.Java;

public class multiDimensional3_Interview_Question {
	/*
	  
	2, 5, 6
	4, 8, 9
	5, 2, 1
	
	Print minimum Number from the above Matrix
	
	 */

	public static void main(String[] args) {

		int abc[][] = {{2,5,6},{4,8,9},{5,2,1}};
		int min= abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
		     	if(abc[i][j]<min)
		     	{
		     		min=abc[i][j];
		     	}
			}
			
		}
   System.out.println(min);
	}

}
