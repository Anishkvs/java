package Step_5;

public class StringHandlingPart2 {
	
	String  S = "Testing World";
	String S1 = "India";
	
// Replace data in a String
	public void ReplaceData() {
		
		System.out.println(S.replace("e", "%$%"));
	}
//Find 'e' in the Text, then How many times
	
	public void findText() {
		System.out.println(S.length() - S.replace("e", "").length());	
	}
	
// Concatenate 2 or more Strings
	public void Concatenate() {
		
		System.out.println(S + " "+S1);
	}
	
//Find substring inside a string
	
	public void substring() {
		
		System.out.println(S.substring(2, 9));
	}
	
//Check a string exist in another string
	
	 public void StringExist() {
		
		 if(S.contains("ing")) {
			 System.out.println("Found");
		 }else {
			 System.out.println("Not found");
		 }

	}
//Split string into multiple substrings
	 String S3 = " Hello This is Testing World ";
	 
	 public void SplitString() {

		 String arr[] = S3.split(" ");
		 
		 for(String a : arr) {
			 System.out.println(a);
		 }
		 

	}
}
