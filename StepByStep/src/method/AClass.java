package method;

public class AClass {

	public void hello() {
		System.out.println("Hello");

	}
	
	public void alpha() {
		System.out.println("Alpha");
	}
	
	public static void main(String[] args) {
		
		AClass obj = new AClass();
		obj.hello();
		obj.alpha();
		System.out.println("Main method...");
		obj.sum();
		obj.dynamicSum(10, 20);
	}
	
	public void sum() {
		
	    int	a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);

	}
	
	public void dynamicSum(int a, int b) {
		
		int c = a+b;
		System.out.println(c);

	}
}
