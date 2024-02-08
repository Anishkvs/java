package com.StringThird.Java;

public class Reverse_Word {

	public static void main(String[] args) {

		String s = "My name is Anishkumar ";
		String[] a = s.split(" ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
//Ym Eman Si Ramukhsina
	}
}
