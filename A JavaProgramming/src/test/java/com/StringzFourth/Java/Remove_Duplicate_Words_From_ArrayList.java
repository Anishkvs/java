package com.StringzFourth.Java;

import java.util.Arrays;

public class Remove_Duplicate_Words_From_ArrayList {

	public static int removeDuplicates(String[] a) {
//        if (a.length == 0) {
//            return 0;
//        }

        int ptr = 0;
        for (int i = 1; i < a.length; i++) {
            if (!a[i].equals(a[ptr])) {
                ptr++;
                a[ptr] = a[i];
            }
        }
        return ptr + 1;
    }

    public static void main(String[] args) {
        String a[] = { "Bus", "Car", "Car", "Train", "Train", "Van", "Ha", "Ha" };
        int uniqueCount = removeDuplicates(a);

        System.out.println("Array with duplicates removed: " + Arrays.toString(Arrays.copyOf(a, uniqueCount)));
    
    }
}