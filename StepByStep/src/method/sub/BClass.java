package method.sub;

import method.*;


public class BClass {

	public static void main(String[] args) {
		
		AClass obj = new AClass();
		obj.hello();
		obj.alpha();
		
		CClass objj = new CClass();
		objj.beta();
		obj.sum();
		obj.dynamicSum(5, 10);
		
	}
	
}
