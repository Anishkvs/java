package com.StringzFourth.Java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicate_Words_From_String {

	public static void main(String[] args) {

       String str = "Hi Hi Hi Sam went went to to his business this this word ha ha ha ";
        
		String[] words = str.split("\\s+"); // Use "\\s+" to handle multiple spaces between words

        Set<String> uniqueWords = new LinkedHashSet<>();
        
        for (String word : words) {
            // Convert the word to lowercase before adding to the set
            uniqueWords.add(word.toLowerCase());
        }

        for (String uniqueWord : uniqueWords) {
            System.out.print(uniqueWord + " ");
        }
    }
}