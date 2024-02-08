package Step_3;

public class ConditionOrAnd {

	public void getData(int a) {
	
		if(a%7==0 && a%5==0){
			System.out.println("Divisible by both");
			
		}
		else if (a%7==0) {
			System.out.println("Divisible by seven");
			
		}
		else if (a%5==0) {
			System.out.println("Divisible by five");
			
		}

		else {
			System.out.println("Not divisible");
			
		}
	}
}
