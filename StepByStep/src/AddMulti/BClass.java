package AddMulti;

import method.*;


public class BClass {

	public static void main(String[] args) {
		
		AClass obj = new AClass();
		int e = obj.dunamicSum(10, 20);
		obj.dunamicMulti(e, 3);
		System.out.println(obj.getMarks());
		obj.value();
	}
	
}
