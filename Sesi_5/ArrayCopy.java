package Sesi_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] number = new int[5];
        Arrays.fill(number, 1);
        System.out.println(Arrays.toString(number));

        int[] shortNumber = Arrays.copyOfRange(number, 0, 2);
        System.out.println(Arrays.toString(shortNumber));

        int[] longNumber = Arrays.copyOf(number, 10);
        System.out.println(Arrays.toString(longNumber));

    }
}
