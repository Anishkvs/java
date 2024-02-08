package com.StringzFourth.Java;
	
public class Remove_Duplicates_number_from_Sorted_Array {

	//Remove Duplicates from a sorted array
	
	public static int removeDuplicate(int[] a) {

		int ptr = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] != a[ptr]) 
			{
				ptr++;
				a[ptr]=a[i];
			}
		}
		return ptr + 1;

	}

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 3, 3, 3, 4 ,5,5,5};

		int unique = removeDuplicate(a);
		System.out.println(unique);
		
		for(int i =0; i<unique; i++)
			System.out.print(a[i]+" ");
	}

}
