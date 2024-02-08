package Array;

import java.util.ArrayList; 

public class ArrayListProg2 {

	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Java");
		obj.add("Language");
		
		System.out.println(obj.get(0));
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		System.out.println(l.get(1));
		
	}

}
