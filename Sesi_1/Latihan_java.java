package Sesi_1;

import java.util.*;
import java.util.LinkedList;

public class Latihan_java {
    public static void main(String[] args) {
        LinkedList<String> buah = new LinkedList<String>();
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        System.out.println("Nama Buah      : " + buah);
        System.out.println("Jumlah Buah    : " + buah.size());

        buah.addFirst("Paling Atas");
        buah.addLast("Paling Bawah");

        buah.set(2, "Diubah");
        buah.set(5, "Diubah");

        System.out.println("Nama Buah      : " + buah);
        System.out.println("Jumlah Buah    : " + buah.size());

        System.out.println("Data Teratas   : " + buah.getFirst());
        System.out.println("Data Terbawah  : " + buah.getLast());
        System.out.println("Data No Index 1: " + buah.get(1));
        System.out.println("Data No Index 3: " + buah.get(3));

        buah.removeFirst();
        buah.removeLast();
        buah.remove(1);

        System.out.println(buah);
    }
}
