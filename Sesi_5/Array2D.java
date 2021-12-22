package Sesi_5;

import java.util.Collection;
import java.util.Iterator;

public class Array2D {
    public static void main(String[] args) {
        String[][] framework = {
                { "Java", "Spring" },
                { "React", "Reactjs" },
                { "PHP", "Laravel" }
        };

        System.out.println();
        for (int x = 0; x < framework.length; x++) {
            System.out.println("Bahasa    : " + framework[x][0]);
            System.out.println("Framework : " + framework[x][1]);
            System.out.println("------------------------------");
        }
        System.out.println();
    }
}
