package script;

import java.util.Scanner;

public class ReadDataFromUser2 {
	public static void main(String[] args) {
		
	System.out.print("Please Enter Your name: - ");
	Scanner obj = new Scanner(System.in);
	String name = obj.nextLine();
	
	System.out.println("Hello.... "+ name);
	
	System.out.println("Your marks is: -");
	String marks = obj.nextLine();
	System.out.println("Mark is "+(marks)+(5));
	}
}
