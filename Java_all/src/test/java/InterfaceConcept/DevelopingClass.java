package InterfaceConcept;

public class DevelopingClass implements BankingInterface, domainInterface {
	
	
	public static void main(String[] args) {
		
		DevelopingClass dc = new DevelopingClass();
		dc.checkingbalance();
		dc.payablecridit();
		dc.transferbalance();
		dc.login();
		
		BankingInterface Bi= new DevelopingClass(); //Run time Polymorpism
		
		domainInterface Di = new DevelopingClass(); 
		Di.investment();
	}
	
	

	@Override
	public void payablecridit() {
		
		System.out.println("Payable Credit");
	}

	@Override
	public void transferbalance() {

		System.out.println("transfer balance");
		
	}

	@Override
	public void checkingbalance() {

		System.out.println("checking balance");
		
	}
	
	public void login() {

		System.out.println("login");
		
	}

	@Override
	public void investment() {
		
		System.out.println("investment");
		
	}


}
