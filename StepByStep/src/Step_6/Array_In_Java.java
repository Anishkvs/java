package Step_6;

public class Array_In_Java {

	public static void main(String[] args) {
		
		int arr[] = {25, 45, 10, 125, 175};
	
	// Length of Array	
		System.out.println("length is: "+arr.length);
		
	//Update vaule in array
		arr[2]= 75;
		System.out.println(arr[2]);
	
	//Display all value in Array
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		
		
	}
}
