package Anagram;

public class Check_all_String_is_alphabet_or_not {

	// Check all is character is alphabet or not

	public static void main(String[] args) {
		String word = "this is Java";

		if (word.matches("[a-zA-Z ]+")) {
			System.out.println("alphapet");
		} else {
			System.out.println("Not an Alphapet");
		}

	}

}
