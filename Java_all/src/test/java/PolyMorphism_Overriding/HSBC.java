package PolyMorphism_Overriding;

public class HSBC extends RBI {
	
	public static void main (String[]args) {
		
		HSBC obj = new HSBC();
			
		System.out.println(obj.getHomeLoanROI());
	}
	
   public static double getHomeLoanROI(){
		
		return 8.25;
	}

}
