package com.Array.Java;

public class reverse_Sort_Array {
//Arrange the number in order wise
	public static void main(String[] args) {

		int arr[] = { 50, 40, 30, 10, 20,};
		System.out.println("Before Sort Array...");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.println("After reserving");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
