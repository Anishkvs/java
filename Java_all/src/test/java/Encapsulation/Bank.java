package Encapsulation;

public class Bank {
	
	//Create some public variables
	
	public int accountNo= 123456;
	public int pinNo=1234;
	public double balanceAmount=100000;
	
	
	public void withdrawAmount(int accNo,int pin,int amount) {
		
		if(accNo==accountNo && pin==pinNo) {
			
			if(amount<=balanceAmount) {
				
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount Withdrwal :"+amount);
				
			}else
			{
				System.out.println("inSuffient ammount");
			}
			
		}else {
			System.out.println("InValid credentials !!!");
		}
	}

}
