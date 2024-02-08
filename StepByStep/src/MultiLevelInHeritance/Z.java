package MultiLevelInHeritance;

public class Z extends D{

	public static void main(String[] args) {
		
		Z ob = new Z();
		ob.AClassMethod();
		ob.BClassMethod();
		ob.CClassMethod();
		ob.DClassMethod();
		
		B bob = new B();
		bob.AClassMethod();
		bob.BClassMethod();
		//D obj = new D();
//		obj.DClassMethod();
//		obj.CClassMethod();
//		obj.BClassMethod();
//		obj.AClassMethod();

	}

}
