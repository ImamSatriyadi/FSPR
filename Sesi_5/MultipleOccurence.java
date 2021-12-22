package Sesi_5;

import java.util.Arrays;

public class MultipleOccurence {
    public static void main(String[] args) {
        String[] text = { "So", "many", "books", "so", "little", "time" };
        String key = "so";
        int found, index;
        found = 0;
        index = 0;

        System.out.println();
        for (String string : text) {
            if (string.toLowerCase().equals(key.toLowerCase())) {
                found += 1;
                System.out.println("Found query at : " + index);
            }

            index++;
        }
        System.out.println("Found          : " + found + " coinciding words");
        System.out.println();
    }
}
