package Step_6;

public class multi_dimension_array {

	public static void main(String[] args) {
		
		int arr[][] = {
					{11, 22, 33, 44},
					{99, 55, 66, 77}
					
		}; 
		
		for(int i=0; i<2; i++) 
		{
			for(int j=0; j<4; j++) 
			{
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
		
	}

}
