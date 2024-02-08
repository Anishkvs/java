package loop;

public class Nested_Loop {

	public static void main(String[] args) {
	
		int i =1;
		int k=2;
		int j=4;
		while(i<=3) {
			System.out.println(i);
			
			for(k=1; k<=5; k++) {
				//System.out.println(k);
				
				do {
					System.out.println("i--->"+i+ "j---->"+j+ "k---->"+k);
					j++;
				}
				while(j<=5);
					//System.out.println(k);
				
			}
		}
		
		
		
		
		
	}

}
