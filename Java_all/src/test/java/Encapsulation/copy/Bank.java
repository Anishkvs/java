package Encapsulation.copy;

public class Bank {
	
	
	public int AccountNo = 123456;
	private int PinNo = 1234;
	private int balanceAmount = 10000;
	
	
	
	public int getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(int balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public int getAccountNo() {
		return AccountNo;
	}

	public void setPinNo(int pinNo) {
		PinNo = pinNo;
	}

	public void withDrawAount(int accNo, int pin, int amount) {
		
		if(accNo==AccountNo && pin ==PinNo) {
			
			if(amount<=balanceAmount) {
				
				balanceAmount = balanceAmount - amount;
				System.out.println("WithDrawl Amount "+amount);
				System.out.println("balanceAmount Amount "+balanceAmount);
				
			}else
			{
				System.out.println("InSuffient balance");
			}
			
		}else
		{
			System.out.println("InValid Pin Number");
		}
	}
	
	public void updatePin(int accNo, int oldPin, int newPin) {
		
		if( accNo==AccountNo && oldPin==PinNo) {
			
			PinNo = newPin;
			System.out.println("Update Pin successful");
			
		}else
		{
			System.out.println("InValid Pin for update credentials");
		}
	}
	
	public double deposit(int accNo, int pin, int depositAmount) {
		
		if(accNo==AccountNo && pin==PinNo) {
			
			balanceAmount = balanceAmount+depositAmount;
			System.out.println("Deposite successful: "+balanceAmount);
		}else
		{
			System.out.println("Invalid credentials");
		}
		return depositAmount;
	}
}
