package Step_5;


public class StringLength {
	
	String S = " Word Length ";
	
	public void getData() {
		//Find the length of given String		
		int i = S.length();
		System.out.println("String length is "+i);

	}
	
	public void trimData() {
		
		int i =  S.trim().length();
		System.out.println("Only word without space "+i);

	}
	
	public void upperLower() {
      
		System.out.println(S.toUpperCase());
		System.out.println(S.toLowerCase());

	}
	
	public void SpecificText() {
		//Find the Specific index of the String
		System.out.println(S.charAt(6));
		
		

	}
}
