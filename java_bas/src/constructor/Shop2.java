package constructor;

public class Shop2 {
	//Constructor
	String brand;
	int discount, price;
	
	public Shop2(String brand, int discount, int price) {
		
		//System.out.println("Test");
		this.brand = brand;
		this.discount = discount;
		this.price = price;		
		
	}
	
	public Shop2(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public static void main(String[] args) {
		
		Shop2 prod1 = new Shop2("ABC", 100, 10);
//		prod1.brand = "ABC";
//		prod1.price= 100;
//		prod1.discount= 10;
//		
		Shop2 prod2 = new Shop2("ZYX", 500, 20);
//		prod2.brand = "ZYX";
//		prod2.price= 500;
//		prod2.discount= 20;
//		
		Shop2 prod3 = new Shop2("Rice", 200);
		
		System.out.println(prod3.brand);
		
		System.out.println(prod1.price);
		System.out.println(prod2.discount);
		prod1.buy();
		
	}
	 void buy() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(discount);
		
	}
	
	
	//Constructor is useful for initializing object specific values.
	// Constructor is getting called, when object is created 
	// Constructor doen't have any return datatype.

}
