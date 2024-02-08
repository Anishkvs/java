package PolyMorphism_pratice;

public class MethodOverloading {
	
	public static void main(String args[]) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.doLogin("Anish", "Bd13feb");
	}
	
	public void add(int a, int b) {
				
	}
	
	public void add(int a, int b, int c) {
		
	}
	
	public void doLogin(String username, String Password) {
		
	}
	
	public void doLogin(int MobileNumber, String username) {
		
	}

}
