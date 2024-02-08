package Array;
//If I want to store multiple value into a single container, then we used arrays.

public class ArraysDemo {

	public static void main(String[] args) {
		
		//A container which stores multiple values of same data type.
		
		int a[] = new int[5];
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;
		
		int b[] = {1,3,5,7,9};
		
		for(int i=0; i<b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
	}

}
