package com.Array.Java;

public class SecondGreatestNumberUpdate {
	public static void main(String[] args) {
		int[] numbers = { 5, 8, 2, 10, 7, 15, 3, 12 };

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

		System.out.println(secondMax);

	}
}
