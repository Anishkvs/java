package com.Array.Java;

public class reverse_Array {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };
		int i = 0, j = arr.length-1 ;
		System.out.println("Before reversing...");

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i = i + 1;
			j = j - 1;

		}
		System.out.println();
		System.out.println("After reserving");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
