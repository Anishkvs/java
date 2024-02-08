package script;

import java.util.Scanner;

public class ReadDataFromUser {

	// Read data from user @Run time: Take user input.
	
	public static void main(String[] args) {
		
	
	System.out.print("Please Enter your name: - ");
	Scanner in = new Scanner(System.in);
	String name = in.nextLine();
	System.out.println("Hello "+name);
	
	}
	
}
