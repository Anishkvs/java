package PolyMorphism_Overriding;

public class CITI extends RBI {
	
	public static void main (String[]args) {
		
		CITI obj = new CITI();
			
		System.out.println(obj.getHomeLoanROI());
	}

    public double getCarLoanROI() {
		
		return 10.5;
		
	}

}
