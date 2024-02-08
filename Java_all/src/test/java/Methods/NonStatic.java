package Methods;

public class NonStatic {
	
	
	public static void main(String[] args) {
		
		NonStatic callObject = new NonStatic();
		callObject.go1();
		
	}
	
	///Static not call to Non Static
	///Non static need an $object$ to call
   public void go1() {
	   
	   System.out.println("Print Go 1");
	   go2();
   }
   
   public void go2() {
	   
	   System.out.println("Print Go 2");
	   go3();
   }

  public void go3() {
	   
	   System.out.println("Print Go 3");
}

}
