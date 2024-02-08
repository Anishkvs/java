
public class pratice {

	
	public static void main(String[] args) {
		
		//Reverse word
		
		String s = "Reverse word";
		String a[] = s.split(" ");
	//(int i =10; i>=0; i--)
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
