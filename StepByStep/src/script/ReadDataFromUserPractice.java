package script;

import java.util.Scanner;

public class ReadDataFromUserPractice {
	
	// Read data from user @Run time: Take user input.
 public static void main(String[] args) {
	
	System.out.println("Please Enter your Name:- ");
	Scanner obj = new Scanner(System.in);
	String name = obj.nextLine();
	System.out.println("Hello...."+name);
	
 }	
}
