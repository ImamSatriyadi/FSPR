package Sesi_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySearching {
    public static void main(String[] args) {
        String[] text = { "love", "is", "in", "the", "air" };

        System.out.println();

        Arrays.sort(text);
        for (String string : text) {
            System.out.print(string + " ");
        }

        System.out.println();
        int search = Arrays.binarySearch(text, "is");
        System.out.println(search);

        System.out.println();
    }
}
