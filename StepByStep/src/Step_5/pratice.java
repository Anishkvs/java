package Step_5;

import org.w3c.dom.Text;

public class pratice {

	String S = " Word lenght ";
	public void getDat() {
    
    int i= S.length();
    System.out.println("Word lenght is: "+i);
	}
	
	public void trim() {
		
		int i =S.trim().length();
		System.out.println(i);

	}
	
	public void textt() {
		
		System.out.println(S.toUpperCase());
		System.out.println(S.toLowerCase());

	}
	
	public void specific() {
		
		System.out.println(S.charAt(8));
	}
	
	String S3 = "This is the java coding";
	
	public void SplitString() {
		
		String arr[]=  S3.split(" ");
		
		for(String a : arr) {
			System.out.println(a);
		}
		
		
	}
//		lg.getData();
//		lg.trimData();
//		lg.upperLower();
//		lg.SpecificText();
	
}
