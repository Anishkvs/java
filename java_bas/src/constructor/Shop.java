package constructor;

public class Shop {
	//Constructor
	String brand;
	int discount, price;
	
	public Shop(String brand, int discount, int price) {
		
		//System.out.println("Test");
		this.brand = brand;
		this.discount = discount;
		this.price = price;		
		
	}
	public static void main(String[] args) {
		
		Shop prod1 = new Shop("ABC", 100, 10);
//		prod1.brand = "ABC";
//		prod1.price= 100;
//		prod1.discount= 10;
//		
		Shop prod2 = new Shop("ZYX", 500, 20);
//		prod2.brand = "ZYX";
//		prod2.price= 500;
//		prod2.discount= 20;
//		
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
