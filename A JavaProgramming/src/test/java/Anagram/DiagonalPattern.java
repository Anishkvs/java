package Anagram;

public class DiagonalPattern {
	
	public static void main(String[] args) {
		
		int size = 5; // Adjust the size of the pattern as needed

		for (int i = 0; i < size; i++) {
		
			for (int j = 0; j < size; j++) {
			
				if (i == j) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
