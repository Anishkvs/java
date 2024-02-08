
public class randomNumber {

	public static void main(String[] args) {
		
		double n1 = Math.random() * 10;
		System.out.println(n1);

	
	
		double num1 = Math.random();
		System.out.println(num1);
		
		//Type----cast
		
		int num3 = (int)(Math.random()*1000000);
		System.out.println(num3);
		
		int num4 = (int)(Math.random()*100);
		System.out.println(num4);
		
		
		
		
		
		
		
		int num = (int)(Math.random()*20);
		//System.out.println(num+" Print interger");
		
		if(num>10)
			System.out.println(num+ " is getter then 10");
		
		else if(num<10 && num>5)
		System.out.println(num+ " is between 10 & 5");
		else
			System.out.println(num+ " is lesser then 10");
		
	}

}
