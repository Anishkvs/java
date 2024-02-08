
public class ifElse {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num>10)
		System.out.println(num+ " is grater then 10");
		
		else if(num<10 && num>5)
			System.out.println(num+ " is between 5 to 10");
			
		
		else
		System.out.println(num+ " is lesser than 10");
	}

}
