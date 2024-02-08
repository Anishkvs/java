package Step_3;

public class NestedCondition {

	/*
	 * Nested Condition
	 * Condition inside another conditions
	 * 
	 * We need to check if the number is greater than 0 and Check Even or Odd
	 */
	
	public void getData(int a) {
	
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Even number");
			}
			else 
			{
				System.out.println("Odd number");
			}
			
			
		}
		else
		{
			System.out.println("Less than zero");
		}
		

	}
	
	
	
}
