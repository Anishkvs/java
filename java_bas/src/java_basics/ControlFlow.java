package java_basics;

public class ControlFlow {
	
public static void main(String[] args) {
		
		boolean hungry = true;
		
		if(hungry) 
		{
			System.out.println("I'm Hungry");
		}else
		{
			System.out.println("I'm not Hungry");
		}
	
/////////////////////////////////////////////////////////////	
		int HungerRating = 5;
		if(!(HungerRating < 6))
		{
			System.out.println("Five are lesser");
		}else
		{
			System.out.println("Greater then Five");
		}
		
//////////////////////////////////////////////////////////////
		
		int favouriteTemp = 75;
		int currentTemp = 60;
		String opinion;
		
		if(currentTemp < favouriteTemp - 30) {
			opinion = "It's pretty Cold";
		} else if(currentTemp < favouriteTemp - 20) {
			opinion = "It's cold";
		} else if(currentTemp < favouriteTemp - 10) {
			opinion = "It's Hot";
		} else {
			opinion= "It's beautiful day";
		}
		
		System.out.println(opinion);
		
///////////////////////////////////////////////////////////////		
		
		
		int month = 3;
		String MonthWise;
		switch(month) {
		
		case 1: MonthWise = "Jan";
				break;
		case 2: MonthWise = "Feb";
		break;
		case 3: MonthWise = "March";
		break;
		
		default: MonthWise = "UnKnown";
		break;
		}
		
		System.out.println(MonthWise);
		
		
		
		
		
  }
	
}
