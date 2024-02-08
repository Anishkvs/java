package MethodOverriding;

public class child extends Parent{
		
	public static void main(String[] args) {
		
		child ob = new child();
		ob.work();
	}
	//@Override
	public void work() {
		System.out.println("IT Org");
		this.Company();
		super.work();
	}
	
	public void Company() {
		System.out.println("Company Name");

	}
}
	
