package Array.loop;

public class reverseString_Palindrome2{
	
	public static void main(String[] args) {
		
		String S = "Reverse";
		String T = "";
		
		for (int i=S.length()-1; i>=0 ; i--)
		{
			T = T+S.charAt(i);
			
		}
		System.out.println(T);
		
		if(T==S)
		{
			
		}
		
	}
	
	
	
	
}
