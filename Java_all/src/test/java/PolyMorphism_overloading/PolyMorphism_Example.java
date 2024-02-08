package PolyMorphism_overloading;

public class PolyMorphism_Example {

	public static void main(String[] args) {
		
		PolyMorphism_Example obj = new PolyMorphism_Example();
		obj.doLogin("9526614644", "pass!@#");
	
		
	}
	
	public void add(int a, int b) {
		
	}
	
    public void add(int a, int b, int c) {
		
	}
    
    public void doLogin(String username, String password) {
    	
    }
    
    public void doLogin(int mobileNumber, String password) {
    	
    }

}
