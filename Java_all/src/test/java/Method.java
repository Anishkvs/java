
public class Method {

	
	public void display() {
		
		System.out.println("Print Method");
	}
	
	public static void main(String[] args) {

	 System.out.println("This is method");
	// Method M1 = display();
	// M1 = display();
	 Calculator c = new Calculator();
	 int i= c.add(4, 5);
	 c.sub(5, 6);
	 
	 System.out.println("THis is add " + i);

	int sub = c.sub(5, 4);
	System.out.println("This is sub "+ sub);
	 
	}

}
