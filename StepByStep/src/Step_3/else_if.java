package Step_3;

public class else_if {


	public void getData(int a) {
		
		if(a<0) {
			System.out.println("Negative number");
		}
		
		else if(a==0) {
			System.out.println("Zero");
		}
		else if(a%2==0) {
			System.out.println("Even number");
		}
		
		else {
			System.out.println("Odd number");
		}
	}
}
