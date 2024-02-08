package com.Array.Java;

public class Smallest_Largest_Element_in_Array {
//Find Smallest and largest element in array
	public static void main(String[] args) {
		
		int a[] = {10, 20, 30, 40, 50};
		int s =a[0];
		for(int i=0; i<a.length; i++)
		{
			if(s<a[i])
				s=a[i];
		}
	
		System.out.println(s);

	}
}
