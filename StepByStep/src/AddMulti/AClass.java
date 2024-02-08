package AddMulti;

public class AClass {

	int marks =20;
	public static void main(String[] args) {
		
	}
	
	public void sum() {
		
	    int	a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);

	}
	
	public int dunamicSum(int a, int b) {
		
		int c = a+b;
		System.out.println(c);
		return c;

	}
	
	public void dunamicMulti(int a, int b) {
		
		int c = a*b;
		System.out.println(c);
		

	}
	
	public int getMarks() {
		return marks;

	}
	
	public float value() {
		float f =23.23f;
		return f;
	}
	
}
