package constructor4;

public class ChennaiSilks4 {
	
	public ChennaiSilks4(int amount) 
	{
		 this(amount, 50);
		System.out.println("Water Bottle");
		
	}
	ChennaiSilks4(int amount, int discount)
	{
		System.out.println("Total bill amount is: "+(amount -discount));
	}
	
	ChennaiSilks4()
	{
		System.out.println("Complimentry gift");
	}
	
}
