package com.Array.Java;

public class SecondGreatestNumber {
	public static void main(String[] args) {
		int[] numbers = { 5, 8, 2, 10, 7, 15, 3};

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int number : numbers) {
			if (number > firstMax) {
				secondMax = firstMax;
				firstMax = number; 
			} else if (number > secondMax && number != firstMax) {
				secondMax = number;
			}
		}
		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("There is no second greatest number.");
		} else {
			System.out.println("The second greatest number is: " + secondMax);
		}
	}
}
