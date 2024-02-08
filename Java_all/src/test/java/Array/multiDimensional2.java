package Array;

public class multiDimensional2 {

	public static void main(String[] args) {
		
		
		int a[][] = new int[2][3];
		a[0][0] = 2;
		a[0][1] = 5;
		a[0][2] = 6;
		a[1][0] = 4;
		a[1][1] = 8;
		a[1][2] = 9;
	  //  System.out.println(a[1][0]);
		
		/*
		int b[][] = {{2,5,6},{4,8,9},{5,2,1}};
		System.out.println(b[2][1]);
		*/
		
		for(int i=0; i<2; i++)  //row
		{
			for(int j=0; j<3; j++) //column
			{
		     	System.out.println(a[i][j]);
			}
			
		}

	}

}
