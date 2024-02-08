package Step_5;

public class StringHandlingPart3 {

	String S = "This is Testing World";
	String S1 = "This is TESTING World";
	
	public void caseSensitive() {
		
		if(S.equals(S1)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
	}
	
	public void caseInSensitive() {
		
		if(S.equalsIgnoreCase(S1)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}

	}
	
	
}
