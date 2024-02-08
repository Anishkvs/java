package Program;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] a = { 1, 0, 5, 8, 9, 9, 2, 5, 2, 1, 2, 2 };
		int[] b = { 0, 7, 6, 3, 24, 1 };

		int a1 = a.length;
		int b1 = b.length;
		
		int c1 = a1+b1;
		int[] c = new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
	}
}
