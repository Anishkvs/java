package java_basics;

public class Theatre {
	//Return
	public static void main(String[] args) {
		
		Theatre screen1 = new Theatre();
		screen1.display_movie();
		int balance = screen1.get_popcorn();
		System.out.println(balance);
	}
	
	public void display_movie() {
		System.out.println("Display Movie");

	}
	
	public int get_popcorn() {
		
		int popcorn_price = 80;
		int cash = 100;
		
		return cash - popcorn_price;
		
	}
	
}
