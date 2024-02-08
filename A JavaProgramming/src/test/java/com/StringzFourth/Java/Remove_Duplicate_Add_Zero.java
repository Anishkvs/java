package com.StringzFourth.Java;

import java.util.Arrays;

public class Remove_Duplicate_Add_Zero {

	public static void main(String[] args) {
		String word = "67845555000223310";
		char[] a = word.toCharArray();
		Arrays.sort(a);
		System.out.println(a);
		int unique = removeDuplicate(a);
		for (int i = 0; i < unique; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int removeDuplicate(char[] a) {

		int ptr = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[ptr]) {
				ptr++;
				a[ptr] = a[i];
			}
		}
		return ptr + 1;
	}
}