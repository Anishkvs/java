package PolyMorphism_pratice;

public class HDFC extends RBI {

	public static void main(String[] args) {
		
		HDFC obj = new HDFC();
		double print = obj.getHomeLoan();
		System.out.println(print);
		
	}

	public static double getHomeLoan() {
		return 8.65;
	}
	
}
