package Encapsulation.copy;

public class ATM {

    public static void main(String[] args) {
    	
    	Bank obj = new Bank();
    	obj.updatePin(123456, 1234, 3333);
    	obj.withDrawAount(123456, 3333, 1000);
    	obj.deposit(123456, 3333, 55000);
    }

	

}
