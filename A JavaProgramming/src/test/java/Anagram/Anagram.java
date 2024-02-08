package Anagram;

import java.util.Arrays;

public class Anagram { // Letter same but word are not same

    public static void main(String[] args) {
        String name = "silentd";
        String name1 = "listens";

        if (name.length() == name1.length()) {

            char a[] = name.toCharArray();
            char b[] = name1.toCharArray(); // Corrected this line

            Arrays.sort(a);
            Arrays.sort(b);
            
            if (Arrays.equals(a, b))
                System.out.println("It's Anagram");
            else
                System.out.println("Not an Anagram");

        } else {
            System.out.println("Not an Anagram");
        }
    }
}
