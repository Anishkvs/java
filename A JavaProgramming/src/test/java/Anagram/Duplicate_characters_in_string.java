package Anagram;

public class Duplicate_characters_in_string {
//Find Duplicate Character or Number in Strings
	
	public static void main(String[] args) {

		String word = "1234456777889";
		//String word = "aabb";
		char[] ch = word.toCharArray();
		 System.out.println(ch);

		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j < word.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicate character are: " + ch[j]);
					break;
				}
			}
		}

	}
}
