package Array;

import java.util.LinkedList; 

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(5);
		ll.add(10);
		ll.add(15);
		ll.add("Java");
		System.out.println(ll);
		
		ll.addFirst(3);
		System.out.println(ll);
		
		
	}

}
