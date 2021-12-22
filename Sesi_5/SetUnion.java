package Sesi_5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUnion {
    public static void main(String[] args) {
        Integer[] number1 = new Integer[] { 3, 25, 2, 79, 2 };
        Integer[] number2 = new Integer[] { 7, 12, 14, 79 };

        Set set1 = new TreeSet();
        Collections.addAll(set1, number1);
        Set set2 = new TreeSet();
        Collections.addAll(set2, number2);

        set1.addAll(set2);

        System.out.println();
        System.out.println(set1);
        System.out.println();
    }
}
